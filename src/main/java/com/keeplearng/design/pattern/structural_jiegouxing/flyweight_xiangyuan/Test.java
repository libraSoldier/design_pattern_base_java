package com.keeplearng.design.pattern.structural_jiegouxing.flyweight_xiangyuan;

/**
 * Created by liangyu
 */
public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
//        for(int i=0; i<10; i++){
//            String department = departments[(int)(Math.random() * departments.length)];
//            Manager manager = (Manager) EmployeeFactory.getManager(department);
//            manager.report();
//
//        }
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b:"+(a==b));

        System.out.println("c==d:"+(c==d));

        /**
         * 适配器模式总结：
         *
         * 1、优点
         * rec: 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
         * rec: 减少内存之外的其他资源占用
         *
         * 2、缺点
         * rec: 关注内/外部状态、关注线程安全问题
         * */

    }
}
