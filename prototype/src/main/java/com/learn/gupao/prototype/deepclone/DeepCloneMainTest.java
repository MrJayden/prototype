package com.learn.gupao.prototype.deepclone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCloneMainTest {

    public static void main(String[] args) throws Exception {
        deepCloneMainTest2();
    }

    public static void deepCloneMainTest() throws CloneNotSupportedException {
        Manager manager = new Manager();
        manager.setName("萧战");
        manager.setDeployee(new Deployee(20,"萧寒"));
        System.out.println("manager = "+manager);
        System.out.println("----------------------------------");
        Manager manager2 = (Manager)manager.clone();
        System.out.println("manager2 = "+manager2);
        System.out.println("manager == manager2         结果是： " +(manager == manager2));
        System.out.println("manager.deployee == manager2.deployee       结果是： "+(manager.getDeployee() == manager2.getDeployee()));
    }

    public static void deepCloneMainTest2()throws Exception{
        Manager manager = new Manager();
        manager.setName("萧战");
        manager.setDeployee(new Deployee(20,"萧寒"));

        FileOutputStream fos = new FileOutputStream("tt.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(manager);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("tt.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Manager manager2 = (Manager)ois.readObject();
        ois.close();

        System.out.println("manager = "+manager);
        System.out.println("manager2 = "+manager2);
        System.out.println("manager == manager2         结果是： " +(manager == manager2));
        System.out.println("manager.deployee == manager2.deployee       结果是： "+(manager.getDeployee() == manager2.getDeployee()));





    }

}
