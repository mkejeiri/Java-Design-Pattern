package com.kejeiri.java.course;

public interface IPerson {
    String getFirstName();
    String getLastName();
    String getPhone();
    int getAge();
    String getAddress();

    class DefautlPerson implements IPerson{
        //Required parameters
        private final String firstName;
        private final String lastName;

        //optional parameters
        protected int age;
        protected String phone;
        protected String address;

        protected DefautlPerson(Builder builder) {
            this(builder.getFirstName(), builder.getLastName());
            this.address = builder.getAddress();
            this.age = builder.getAge();
            this.phone=builder.getPhone();
        }

        private DefautlPerson(String firstName, String lastName) {
            this.firstName=firstName;
            this.lastName=lastName;
        }

        @Override
        public String getFirstName() {
            return firstName;
        }

        @Override
        public String toString() {
            return "Name: "+firstName+" "+lastName+",age: "+age+" ,address: "+address+" ,phone: "+phone;
        }

        @Override
        public String getLastName() {
            return lastName;
        }

        @Override
        public String getPhone() {
            return phone;
        }

        @Override
        public int getAge() {
            return age;
        }

        @Override
        public String getAddress() {
            return address;
        }
    }
    //Inner class of the interface
     class Builder extends  DefautlPerson{
        public Builder(String firstName, String lastName) {
            super(firstName,lastName);
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder phone (String phone){
            this.phone=phone;
            return this;
        }
        public Builder address (String address){
            this.address=address;
            return this;
        }
        IPerson build(){
            return new DefautlPerson(this);
        }
    }


}
