package dev.vivek.Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class SingletonClass{
    private static SingletonClass instance;
    public static Lock lock1  = new ReentrantLock();
    private SingletonClass(){
        System.out.println("SingletonClass Constructor Called");
    }

    public static SingletonClass getInstance(){

        if(instance==null){
            lock1.lock();
            if(instance==null){
                instance = new SingletonClass();
            }
            lock1.unlock();
        }
        return instance;
    }

    Object readResolve()
    {
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return instance;
    }
}