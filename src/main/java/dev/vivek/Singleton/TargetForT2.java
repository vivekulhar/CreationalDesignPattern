package dev.vivek.Singleton;

public class TargetForT2 implements Runnable{
    public SingletonClass singletonClass;
    @Override
    public void run(){
        singletonClass = SingletonClass.getInstance();
        System.out.println("SingletonClass instance hashcode thread 2: "+singletonClass.hashCode());
    }
}
