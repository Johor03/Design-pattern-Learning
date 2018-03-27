package org.ch02;

/**
 * 双重检验锁模式（double checked locking pattern），是一种使用同步块加锁的方法。
 * 程序员称其为双重检查锁，因为会有两次检查 instance == null，一次是在同步块外，一次是在
 * 同步块内。为什么在同步块内还要再检验一次？因为可能会有多个线程一起进入同步块外的 if，如果在
 * 同步块内不进行二次检验的话就会生成多个实例了。
 * 
 * 主要在于instance = new Singleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3 件事情。
 * 1.给 instance 分配内存
 * 2.调用 Singleton 的构造函数来初始化成员变量
 * 3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null了）
 * 
 * 使用 volatile 的原因是可见性，也就是可以保证线程在本地不会存有 instance 的副本，每次都是去主内存中读取。但其实是不对的。
 * 使用 volatile 的主要原因是其另一个特性：禁止指令重排序优化。也就是说，在 volatile 变量的赋值操作后面会有一个内存屏障（生
 * 成的汇编代码上），读操作不会被重排序到内存屏障之前。比如上面的例子，取操作必须在执行完 1-2-3 之后或者 1-3-2 之后，不存在执行
 * 到 1-3 然后取到值的情况。从「先行发生原则」的角度理解的话，就是对于一个 volatile 变量的写操作都先行发生于后面对这个变量的读
 * 操作（这里的“后面”是时间上的先后顺序）。
 */
public class SingletonLazy {
    
    private volatile static SingletonLazy instance;
    
    private SingletonLazy() {
    }
    
    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
