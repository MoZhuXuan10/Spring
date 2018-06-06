package com.syl;

import com.syl.service.BuyStockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BuyStock {
    /**
     使用AspectJ实现事务的管理
     */
    @Test
    public  void testAspectJ(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        BuyStockService service= context.getBean("buyStockService",BuyStockService.class);
        service.buyStock("张三",5000.0,10);

    }

    /**
     * 使用事务工厂实现事务的管理
     */
    @Test
    public  void testAffairs(){
        ApplicationContext context=new ClassPathXmlApplicationContext("affairs.xml");
        BuyStockService service= context.getBean("buyStockService",BuyStockService.class);
        service.buyStock("张三",5000.0,10);
    }
    /**
     * 使用注解实现事务的管理
     */
    @Test
    public  void testAnnotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
        BuyStockService service= context.getBean("buyStockService",BuyStockService.class);
        service.buyStock("张三",5000.0,10);
    }
}
