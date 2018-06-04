package com.java.course;

//this the Handler!
public abstract class PurchasePower {
    protected static final double BASE=1000.00;
    protected PurchasePower successor;
    abstract protected double getAllowable();
    abstract protected String getRole();

    public PurchasePower getSuccessor() {
        return successor;
    }

    public void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    //Chain of responsibility and decision making!
     public void processRequest(PurchaseRequest request){
        if (request.getAmount()<this.getAllowable()){
            System.out.println(this.getRole() +" will approve $ "+request.getAmount());
        }else if(successor !=null) {
            System.out.println(this.getRole());
                    successor.processRequest(request);
        }
     }
}
