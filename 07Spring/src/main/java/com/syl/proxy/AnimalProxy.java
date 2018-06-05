package com.syl.proxy;

import com.syl.dao.Animal;
import com.syl.dao.impl.Dog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 我们自身的动态代理类
 * 无论有多少个animal  都没有问题
 */
public class AnimalProxy implements InvocationHandler {
    /**
     *  01.我们不确定委托类是谁？委托类的类型 是Object
     *   和委托类建立关联关系
     */
    private Object object;

    /**
     * 02.给我一个委托类，我返回一个代理类对象
     */
    public Object createProxy(Object target){
        this.object=target;//传递什么 委托类是什么
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    /**
     * 实现系统级业务和主业务之间的交互
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====洗洗手====");
        Object result=method.invoke(object,args);
        System.out.println("====再次洗洗手====");
        return result;
    }
    /**
     * 创建测试方法
     */
    public static void main(String[] args){
        AnimalProxy proxy=new AnimalProxy();
        Animal dog=(Animal)proxy.createProxy(new Dog());
        dog.eat();
        System.out.println("*********************");
        dog.sleep();
    }
}
