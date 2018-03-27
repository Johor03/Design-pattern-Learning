package org.ch02;

/**
 * 饿汉式单例模式
 * 单例的实例被声明成 static 和 final 变量了，在第一次加载类到内存中时就会初始化，所以创建实例本身是线程安全的。
 */
public class SingletonHungry{
    //类加载时就初始化
    private static final SingletonHungry instance = new SingletonHungry();
    
    private SingletonHungry(){}
   
    public static SingletonHungry getInstance(){
        return instance;
    }
}


  