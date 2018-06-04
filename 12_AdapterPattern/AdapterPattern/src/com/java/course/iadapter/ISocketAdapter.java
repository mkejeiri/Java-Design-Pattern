package com.java.course.iadapter;
import com.java.course.model.Volt;

//Target
public interface ISocketAdapter {
    Volt get120Volts();
    Volt get12Volts();
    Volt get3Volts();
    Volt get1Volts();
}
