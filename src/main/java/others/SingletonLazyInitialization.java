package main.java.others;

/**
 * xiaolong.zhang3
 */

/**
 * 什么是单例模式

 单例模式，也叫单子模式，是一种常用的软件设计模式。在应用这个模式时，单例对象的类必须保证只有一个实例存在。
 中心原则就是：单例对象的类必须保证只有一个实例存在

 在java中主要有两种构建方式

 懒汉方式。指全局的单例实例在第一次被使用时构建。
 饿汉方式。指全局的单例实例在类装载时构建。
 简单的说就是一个需要延迟初始化，一个则不需要。
 *
 */

/**
 * JVM在类的初始化阶段（即在Class被加载后，且被线程使用之前），会执行类的初始化。在执行类的初始化期间，JVM会去获取一个锁。这个锁可以同步多个线程对同一个类的初始化。相比其他实现方案（如double-checked locking等），该技术方案的实现代码较为简洁，并且在所有版本的编译器中都是可行的。

 关于static final Singleton INSTANCE域的访问权限为什么时包级私有可以阅读:Initialization On Demand Holder idiom的实现探讨
 */
public class SingletonLazyInitialization {

    private SingletonLazyInitialization(){}

    private static class LazyHolder {
        static final SingletonLazyInitialization INSTANCE = new SingletonLazyInitialization();
    }
    public static SingletonLazyInitialization getInstance(){
        return LazyHolder.INSTANCE;
    }
}
