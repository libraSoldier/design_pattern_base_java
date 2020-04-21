package com.keeplearng.design.pattern.behavioral_xingweixing.memento_beiwanglu;

import java.util.Stack;

/**
 * @Author liangyu
 * @create 2020/4/21 9:30 下午
 * @Description
 */
public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
