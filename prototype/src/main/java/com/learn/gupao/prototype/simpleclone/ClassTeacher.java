package com.learn.gupao.prototype.simpleclone;

public class ClassTeacher {
    private String name;
    public ClassTeacher(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassTeacher{" +
                "name='" + name + '\'' +
                '}';
    }
}
