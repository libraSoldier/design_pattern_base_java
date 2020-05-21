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
         * 享元模式总结：
         *
         * 定义：
         * 提供了减少对象数量从而改善应用所需的对象结构的方式
         * 运用共享技术有效地支持大量细粒度的对象
         *
         * 适用场景：
         * 常常应用于系统底层的开发，以便解决系统的性能问题
         * 系统有大量相似对象、需要缓冲池的场景
         *
         * 1、优点
         * rec: 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
         * rec: 减少内存之外的其他资源占用
         *
         * 2、缺点
         * rec: 关注内/外部状态、关注线程安全问题
         * rec: 使系统、程序的逻辑复杂化
         * */

    }
}
