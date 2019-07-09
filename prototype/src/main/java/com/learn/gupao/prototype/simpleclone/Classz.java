package com.learn.gupao.prototype.simpleclone;

import java.util.List;

public class Classz implements Cloneable{
    private String className;

    private int  peopleCount;

    private ClassTeacher classTeacher;

    private List<Student> students;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public ClassTeacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(ClassTeacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    @Override
    public String toString() {
        return "Classz{" +
                "className='" + className + '\'' +
                ", peopleCount=" + peopleCount +
                ", classTeacher=" + classTeacher +
                ", students=" + students +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
