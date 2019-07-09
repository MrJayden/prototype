package com.learn.gupao.prototype.deepclone;

import java.io.Serializable;

public class Manager implements Cloneable, Serializable {

    private String name;

    private Deployee deployee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deployee getDeployee() {
        return deployee;
    }

    public void setDeployee(Deployee deployee) {
        this.deployee = deployee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", deployee=" + deployee +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Manager manager = new Manager();
        manager.setName(this.name);
        manager.setDeployee((Deployee) this.getDeployee().clone());
        return manager;
    }
}
