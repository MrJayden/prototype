package com.learn.gupao.prototype.deepclone;

import java.io.Serializable;

public class Deployee implements Cloneable, Serializable {

    private int workYear;

    private String name;

    public Deployee(int workYear,String name){
        this.workYear = workYear;
        this.name = name ;
    }

    public int getWorkYear() {
        return workYear;
    }

    public void setWorkYear(int workYear) {
        this.workYear = workYear;
    }

    @Override
    public String toString() {
        return "Deployee{" +
                "workYear=" + workYear +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
