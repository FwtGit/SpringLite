package cn.von.springframework.beans.factory.support;

import cn.von.springframework.beans.factory.config.BeanDefinition;


public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
