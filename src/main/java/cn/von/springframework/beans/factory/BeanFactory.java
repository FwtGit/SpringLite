package cn.von.springframework.beans.factory;

import cn.von.springframework.beans.BeansException;

/**
 * 博客：https://von.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：von虫洞栈
 * Create by 小傅哥(fustack)
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
