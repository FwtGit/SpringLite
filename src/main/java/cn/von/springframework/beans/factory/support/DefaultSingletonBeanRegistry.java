package cn.von.springframework.beans.factory.support;

import cn.von.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 博客：https://von.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：von虫洞栈
 * Create by 小傅哥(fustack)
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
