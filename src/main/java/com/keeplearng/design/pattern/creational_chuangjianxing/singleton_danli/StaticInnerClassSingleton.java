package com.keeplearng.design.pattern.creational_chuangjianxing.singleton_danli;

/**
 * Created by liangyu
 * rec: 非构建线程，不允许看到指令重排序
 */
public class StaticInnerClassSingleton {
    // rec: 核心在于InnerClass对象的初始化锁被哪个线程拿到
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
