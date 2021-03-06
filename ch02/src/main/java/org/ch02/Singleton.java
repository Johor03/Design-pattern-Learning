package org.ch02;

/**
 * 静态内部类单例模式,饿汉式变种
 * 
 * JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，除了 getInstance() 
 * 之外没有办法访问它，因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK版本
 */
public class Singleton{
    
    private static class SingletonHolder {  
        private static final Singleton INSTANCE = new Singleton();  
    }  
    
    private Singleton (){}  
    
    public static final Singleton getInstance() {  
        return SingletonHolder.INSTANCE; 
    }   
}


  