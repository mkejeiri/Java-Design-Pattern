package com.java.course;
/*
                            Adapter Pattern
 Converts the interface of a class into another interface the client expect.
 Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
* */

import com.java.course.iadapter.ISocketAdapter;
import com.java.course.model.SocketAdapterImplementation;
import com.java.course.model.SocketObjectAdapterImplmentation;
import com.java.course.model.Volt;

//Client
public class Main {

    public static void main(String[] args) {
        testingSocketObject();
        testingClassAdapter();
    }

    private static void testingClassAdapter() {
        ISocketAdapter adapter = new SocketAdapterImplementation();
        Volt v1 = getVolt(adapter,1);
        Volt v3 = getVolt(adapter,3);
        Volt v12 = getVolt(adapter,12);
        Volt v120 = getVolt(adapter,120);
        System.out.println("V1 is using class adapter (volt) "+v1.getVolts());
        System.out.println("V3 is using class adapter (volt) "+v3.getVolts());
        System.out.println("V12 is using class adapter (volt) "+v12.getVolts());
        System.out.println("V120 is using class adapter (volt) "+v120.getVolts());




    }

    public static void testingSocketObject(){
        ISocketAdapter objectAdapterImp = new SocketObjectAdapterImplmentation();
        Volt v1 = getVolt(objectAdapterImp,1);
        Volt v3 = getVolt(objectAdapterImp,3);
        Volt v12 = getVolt(objectAdapterImp,12);
        Volt v120 = getVolt(objectAdapterImp,120);
        System.out.println("V1 is using object adapter (volt) "+v1.getVolts());
        System.out.println("V3 is using object adapter (volt) "+v3.getVolts());
        System.out.println("V12 is using object adapter (volt) "+v12.getVolts());
        System.out.println("V120 is using object adapter (volt) "+v120.getVolts());
    }

    private static Volt getVolt(ISocketAdapter objectAdapterImp, int i) {
        switch (i) {
            case 1 : return objectAdapterImp.get1Volts();
            case 3 : return objectAdapterImp.get3Volts();
            case 12 : return objectAdapterImp.get12Volts();
            default:return objectAdapterImp.get120Volts();
        }
    }
}
