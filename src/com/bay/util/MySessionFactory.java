package com.bay.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 * 产生session
 */
public class MySessionFactory {
    private static Configuration config;
    private static SessionFactory factory;
    private static Session session;
    //    服务注册机制 4.0版本以上
    private static ServiceRegistryBuilder builder;
    private static ServiceRegistry registry;

    static {
//        1.获取配置对象
        config = new Configuration();
//        2.加载配置cfg文件
        config.configure("hibernate.cfg.xml");
//        3.获取ServiceRegistryBuilder对象
        builder = new ServiceRegistryBuilder();
//        4.加载config配置信息
        builder.applySettings(config.getProperties());
//        5.通过builder 构建服务注册信息对象
        registry = builder.buildServiceRegistry();
//        6.构建服务工厂
        factory = config.buildSessionFactory(registry);
    }

    public static Session getSession() {
        if (session == null) {
            session = factory.openSession();
        }
        return session;
    }
}
