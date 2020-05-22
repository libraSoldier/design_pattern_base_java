package com.keeplearng.design.pattern.behavioral_xingweixing.memento_beiwanglu;

/**
 * @Author liangyu
 * @create 2020/4/21 9:36 下午
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        /**
         * 备忘录模式总结：
         *
         * 定义：
         * 保存一个对象的某个状态，以便在适当的时候恢复对象
         * "后悔药"
         *
         * 适用场景：
         * 保存及恢复数据相关业务场景
         * 后悔的时候，想恢复到之前的状态
         *
         * 1、优点
         * rec: 为用户提供一种可恢复机制
         * rec: 存档信息的封装
         *
         * 2、缺点
         * rec: 资源占用
         * */

        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("设计模型A", "手记内容A", "手记图片A");

        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题："+ article.getTitle() + "内容：" +
                article.getContent() + "图片：" + article.getImgs() + "暂存成功");

        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");

        article.setTitle("设计模型B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");

        System.out.println("修改手记end");

        System.out.println("手记完整信息：" + article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("设计模型c");
        article.setContent("手记内容c");
        article.setImgs("手记图片c");

        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("手记完整信息：" + article);
    }
}
