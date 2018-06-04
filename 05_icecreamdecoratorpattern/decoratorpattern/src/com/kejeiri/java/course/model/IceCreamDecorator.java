package com.kejeiri.java.course.model;

import com.kejeiri.java.course.imodel.IceCream;
/*
* alternative to decorator: having inheritance from a base class, i.e creating a lot of object
* in memory not created at runtime = lagging = not cost effective
* with decorator we create on demand at runtime.
* the downsize of decorator is:
*   - we most likely end up with a lot of different small class
*   - BUT: at least those classes are compartmentalized and they work on their own, which
*     allow more flexibility and maintainability of code.
*     the decorator allow us to wrap all the kind of ice-cream!
*
* */
public abstract class IceCreamDecorator implements IceCream {
    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return this.iceCream.cost();
    }
}
