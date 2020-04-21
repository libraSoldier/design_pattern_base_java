package com.keeplearng.design.pattern.behavioral_xingweixing.templatemethod_moban;

/**
 * Created by liangyu
 */
public abstract class ACourse {

    // rec: 声明为final防止子类修改
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写手记");
    }
    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();





}
