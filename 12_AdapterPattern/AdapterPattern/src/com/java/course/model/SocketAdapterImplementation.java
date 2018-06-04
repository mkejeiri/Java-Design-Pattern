package com.java.course.model;

import com.java.course.iadapter.ISocketAdapter;
/*
                            Adapter Pattern
 Converts the interface of a class into another interface the client expect.
 Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
* */


//Class Adapter using inheritance
public class SocketAdapterImplementation extends  Socket  implements ISocketAdapter {
    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = getVolt();
        return ConvertVolt(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = getVolt();
        return ConvertVolt(v, 40);
    }

    @Override
    public Volt get1Volts() {
        Volt v = getVolt();
        return ConvertVolt(v,120);
    }
    private Volt ConvertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
