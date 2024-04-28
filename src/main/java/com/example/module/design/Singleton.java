package com.example.module.design;

/**
 * 单例模式
 *
 * @author lrf
 * @create 2024/4/2
 */

public class Singleton {
    
    /** 构造器私有化 */
    private Singleton() {}
    
    /** 声明内部静态类 */
    private static class SingletonHolder {
        /** 声明对象 */ 
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 对外提供访问的方法
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    } 

}
