package com.syl.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Processor  本意是加工 处理的意思！
 *
 * 实现了BeanPostProcessor
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor(){
        System.out.println("===MyBeanPostProcessor的无参构造方法 ===");
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("===执行了BeanPostProcessor中的 postProcess ==Before==Initialization  ===");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("===执行了BeanPostProcessor中的 postProcess ==After==Initialization  ===");
        return bean;
    }
}
