package com.keeplearng.design.pattern.behavioral_xingweixing.visitor_fangwenzhe;

/**
 * @Author liangyu
 * @create 2020/4/21 10:28 下午
 * @Description
 */
public class CodingCourse extends Course {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
