package com.java.course.facade;

import com.java.course.subsystem.CPU;
import com.java.course.subsystem.HardDrive;
import com.java.course.subsystem.Memory;

public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;

    public ComputerFacade(CPU processor, Memory ram, HardDrive hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }
    public void start(){
        processor.freeze();
        ram.load(132,hd.read(35865,80));
        processor.jump(132);
        processor.execute();
    }
}
