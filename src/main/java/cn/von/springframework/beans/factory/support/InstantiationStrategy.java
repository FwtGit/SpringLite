package cn.von.springframework.beans.factory.support;

import cn.von.springframework.beans.BeansException;
import cn.von.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 博客：https://von.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：von虫洞栈
 * Create by 小傅哥(fustack)
 * <p>
 * Bean 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
