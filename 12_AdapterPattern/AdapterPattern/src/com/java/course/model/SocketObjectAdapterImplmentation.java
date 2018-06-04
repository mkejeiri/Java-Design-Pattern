package com.java.course.model;

import com.java.course.iadapter.ISocketAdapter;

//Class adapter using composition for adapter pattern
public class SocketObjectAdapterImplmentation implements ISocketAdapter {
    //using composition over inheritance!
    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v= socket.getVolt();
        return ConvertVolt(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v= socket.getVolt();
        return ConvertVolt(v,40);
    }

    @Override
    public Volt get1Volts() {
        Volt v= socket.getVolt();
        return ConvertVolt(v,120);
    }
    private Volt ConvertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
