package com.syl.proxy;

import com.syl.dao.Animal;
import com.syl.dao.impl.Dog;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * cglib 动态代理
 */
import java.lang.reflect.Method;


/**
 * CglibProxy 代理类   （接口 + 类）
 */
public class CglibProxy implements MethodInterceptor {
    /**
     * 在enhancer中有一个setCallBack(this)
     * 这样就实现了代理类和委托类的关联
     */
    private Enhancer enhancer=new Enhancer();

    /**
     *  创建代理类对象
     */
    public  Object  createProxy(Class clazz){
        //设置公共的接口或者公共的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);  //建立关联关系
        return enhancer.create();
    }



    /**
     * 代理类执行 委托类的 方法
     * 系统级业务进行增强
     */
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("====洗洗手====");
        Object result= methodProxy.invokeSuper(o,args);
        System.out.println("====再次洗洗手====");
        return result;
    }

    //测试代码
    public static void main(String[] args) {
        CglibProxy proxy=new CglibProxy();
        Animal dog= (Animal) proxy.createProxy(new Dog().getClass());
        dog.eat();
        System.out.println("*********************");
        dog.sleep();
    }


}
