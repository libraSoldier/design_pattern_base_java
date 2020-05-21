package com.keeplearng.design.pattern.structural_jiegouxing.composite_zuhe;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();

        /**
         * 组合模式总结：
         *
         * 定义：
         * 将对象组合成树形结构以表示"部分-整体"的层次结构
         * 组合模式使客户端对单个对象和组合对象保持一致的方式处理
         *
         * 适用场景：
         * 希望客户端可以忽略组合对象与单个对象的差异时
         * 处理一个树形结构时
         *
         * 1、优点
         * rec: 清楚地定义分层次的复杂对象、表示对象的全部或部分层次
         * rec: 让客户端忽略了层次的差异，方便对整个层次结构进行控制
         * rec: 简化客户端代码
         * rec: 符合开闭原则
         *
         * 2、缺点
         * rec: 限制类型时会比较复杂
         * rec: 使设计变的更加抽象
         * */



    }
}
