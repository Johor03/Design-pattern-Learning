package org.ch02;

/**
 * 懒汉式单例模式,线程不安全
 */
public class SingletonLazy2 {
    private static SingletonLazy2 instance;
    
    private SingletonLazy2() {}
    
    public static SingletonLazy2 getInstance() {
        if(instance == null) {
            instance = new SingletonLazy2();
        }
        return instance;
    }
}
