import org.junit.Test;

import java.util.ArrayList;

public class ApiTest {


    @Test
    public void test_BeanFactory(){
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new ArrayList());
        beanFactory.registerBeanDefinition("list",beanDefinition);

        ArrayList list = (ArrayList) beanFactory.getBean("list");


        System.out.println(list);
    }
}
