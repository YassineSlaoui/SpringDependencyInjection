package com.ys.MainApp.impl;

import com.ys.MainApp.interfaces.IEngine;

public class Vehicle {

    IEngine engine;
    Tyres tyre;

    public Vehicle() {
    }

    public Vehicle(IEngine engine, Tyres tyre) {
        System.out.println("Constructing vehicle using parametrized constructor: engine=" + engine + ", tyre=" + tyre);
        this.engine = engine;
        this.tyre = tyre;
    }

    public Tyres getTyre() {
        return tyre;
    }

    public void setTyre(Tyres tyre) {
        System.out.println("Setting vehicle tyre=" + tyre + ", using setter method.");
        this.tyre = tyre;
    }


    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        System.out.println("Setting vehicle engine=" + engine + ",using setter method.");
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle Object{" +
                "engine=" + engine +
                ", tyre=" + tyre +
                '}';
    }
}
