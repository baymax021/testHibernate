package com.bay.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 * ����session
 */
public class MySessionFactory {
    private static Configuration config;
    private static SessionFactory factory;
    private static Session session;
    //    ����ע����� 4.0�汾����
    private static ServiceRegistryBuilder builder;
    private static ServiceRegistry registry;

    static {
//        1.��ȡ���ö���
        config = new Configuration();
//        2.��������cfg�ļ�
        config.configure("hibernate.cfg.xml");
//        3.��ȡServiceRegistryBuilder����
        builder = new ServiceRegistryBuilder();
//        4.����config������Ϣ
        builder.applySettings(config.getProperties());
//        5.ͨ��builder ��������ע����Ϣ����
        registry = builder.buildServiceRegistry();
//        6.�������񹤳�
        factory = config.buildSessionFactory(registry);
    }

    public static Session getSession() {
        if (session == null) {
            session = factory.openSession();
        }
        return session;
    }
}
