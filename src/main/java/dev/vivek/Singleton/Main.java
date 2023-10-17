package dev.vivek.Singleton;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        TargetForT1 targetForT1 = new TargetForT1();
        TargetForT2 targetForT2 = new TargetForT2();
        Thread t1 = new Thread(targetForT1);
        Thread t2 = new Thread(targetForT2);

        t1.start();
        t2.start();

        SingletonClass singletonClass1 = SingletonClass.getInstance();
        System.out.println("SingletonClass instance hashcode: "+singletonClass1.hashCode());
        t1.join();
        t2.join();

    }
}