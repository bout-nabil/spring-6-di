package nbo.springframework.spring6di.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import nbo.springframework.spring6di.controllers.MyController;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean , BeanNameAware,
        BeanFactoryAware , ApplicationContextAware, BeanPostProcessor {
    public LifeCycleDemoBean() {
        System.out.println("## I am in the LifeCycleDemoBean constructor");
    }

    private String javaVersion;

    @Value("${java.specification.version}")
    public void getJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
        System.out.println("## 1. Java Version: " + this.javaVersion);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 2. My Bean Name is: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("## 3. Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4. Application Context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## 5 postConstruct The Post Construct annotated method has been called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 afterPropertiesSet Populate Properties The LifeCycleBean has its properties set!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7 The @PreDestroy annotated method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 The destroy method has been called");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## 9 postProcessBeforeInitialization: Bean Name: " + beanName);
        if (bean instanceof MyController) {
            MyController myController = (MyController) bean;
            System.out.println("Calling before initialization on MyController");
            myController.beforeInitialization();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## 10 postProcessAfterInitialization: Bean Name: " + beanName);
        if (bean instanceof MyController) {
            MyController myController = (MyController) bean;
            System.out.println("Calling after initialization on MyController");
            myController.afterInitialization();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
