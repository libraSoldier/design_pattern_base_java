package com.keeplearng.design.pattern.creational_chuangjianxing.singleton_danli;

/**
 * Created by liangyu
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    // rec: volatile，所以线程都能看到共享内存的最新状态，保证了内存的可见性
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // rec: volatile 解决指令重排序的问题，禁止指令重排序，对象已经分配了内存地址，但是还没有初始化完成
                    //1.分配内存给这个对象
//                  //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
//                    intra-thread semantics（rec: 保证重排序不会改变单线程的程序执行结果）
//                    ---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址

                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
