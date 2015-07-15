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
 */

/**
 * 这种方式实现简单，实例在类装载时构建，如果想要实现一种实例在第一次被使用时构建应该怎么做？
 */

public class SingletonSimple {
    private final static SingletonSimple INSTANCE = new SingletonSimple();

    private SingletonSimple(){}

    public static SingletonSimple getInstance(){
        return INSTANCE;
    }
}
