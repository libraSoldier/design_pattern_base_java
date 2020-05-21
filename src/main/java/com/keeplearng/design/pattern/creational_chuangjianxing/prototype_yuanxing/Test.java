package com.keeplearng.design.pattern.creational_chuangjianxing.prototype_yuanxing;

/**
 * Created by liangyu
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);
        for(int i = 0;i < 10;i++){
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            mailTemp.setContent("恭喜您，此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:"+mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }

    /**
     * 原型模式总结：
     *
     * clone方法不会调用类的构造方法
     *
     * 浅克隆-不会克隆类中包含的引用变量
     * 深克隆-类中包含的引用变量也会克隆
     * 克隆可以破坏单例模式，需要修改clone方法的内容，不能直接调用父类的方法实现
     *
     * 定义：
     * 指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
     * 不需要知道任何创建的细节，不调用构造函数
     *
     * 适用场景：
     * 类初始化消耗较多资源
     * new产生的一个对象需要非常繁琐的过程（数据准备，访问权限等）
     * 构造函数比较复杂
     * 循环体中产生大量对象时
     *
     * 1、优点
     * rec: 原型模式性能比直接new一个对象性能高
     * rec: 简化创建过程
     *
     * 2、缺点
     * rec: 必须配备克隆方法
     * rec: 对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
     * rec: 深拷贝、浅拷贝要运用得当
     *
     * */
}
