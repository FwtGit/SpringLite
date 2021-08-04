package cn.von.springframework.beans.factory.support;

import cn.von.springframework.beans.factory.config.BeanDefinition;

/**
 * 博客：https://von.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：von虫洞栈
 * Create by 小傅哥(fustack)
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
