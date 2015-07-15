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
 * 此种方法只能用在JDK5及以后版本(注意 INSTANCE 被声明为 volatile)，之前的版本使用“双重检查锁”会发生非预期行为.

 推荐阅读:

 Effective Java 第71条 慎用延迟初始化
 Core Java 第一卷 14.5.8 Volatile 域
 JSL 17.4
 Java 理论与实践: 正确使用 Volatile 变量
 双重检查锁定与延迟初始化
 */
public class SingletonDoubleCheckLocking {
    private static volatile SingletonDoubleCheckLocking INSTANCE = null;

    private SingletonDoubleCheckLocking(){}

    //thread safe and performance  promote
    public static SingletonDoubleCheckLocking getInstance(){
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheckLocking.class) {
                //when more than two threads run into the first null check same time,
                //to avoid instanced more than one time, it needs to be checked again.
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }
}
