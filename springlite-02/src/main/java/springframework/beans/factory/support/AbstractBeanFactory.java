package springframework.beans.factory.support;

import springframework.beans.BeansException;
import springframework.beans.factory.BeanFactory;
import springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    public Object getBean(String beanName) throws BeansException, InstantiationException, IllegalAccessException {
        Object bean = getSingleton(beanName);
        if (bean!=null) return bean;

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName,beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException, IllegalAccessException, InstantiationException;

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
