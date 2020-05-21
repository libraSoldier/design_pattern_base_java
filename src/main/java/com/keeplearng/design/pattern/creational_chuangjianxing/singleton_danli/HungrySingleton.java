package com.keeplearng.design.pattern.creational_chuangjianxing.singleton_danli;

import java.io.Serializable;

/**
 * Created by liangyu
 * rec: 饿汉式单例模式
 */
public class HungrySingleton implements Serializable,Cloneable{
    // rec: 声明为final，必须在类加载时就初始化完成
    private final static HungrySingleton hungrySingleton;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    // 解决：类序列化、反序列化后类不相同问题
    private Object readResolve(){
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
