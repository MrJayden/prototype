package com.learn.gupao.prototype.simpleclone;

import java.util.ArrayList;
import java.util.List;

public class SimpleCloneMainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Classz classz = new Classz();
        classz.setClassName("三年级二班");
        classz.setPeopleCount(56);
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三",7,"男"));
        students.add(new Student("韩梅梅",6,"女"));
        classz.setStudents(students);
        classz.setClassTeacher(new ClassTeacher("上仙"));
        System.out.println("classz = "+classz);
        System.out.println("-----------------------------------------------");
        Classz classz2 = (Classz)classz.clone();
        System.out.println("classz2 = "+classz2);
        classz2.setClassName("三年级一班");
        classz2.setPeopleCount(23);
        classz2.getClassTeacher().setName("中流砥柱");

        classz2.getStudents().add(new Student("李四",8,"男"));

        System.out.println("classz2 = "+classz2);
        System.out.println("-------------------------------------------------");
        System.out.println("classz = "+classz);
        System.out.println(classz.getStudents() == classz.getStudents());
    }
}
