package com.bay.test;

import com.bay.model.NewsUser;
import com.bay.model.Student;
import com.bay.util.MySessionFactory;
import org.hibernate.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
public class Test {
    public static void main(String[] args) {
        Session session = MySessionFactory.getSession();
//        ��ɾ��  ��ʼ����
        Transaction transaction = session.beginTransaction();
        Student student = new Student(4, "xiaowang", "��", 24, "Java", 98);
        System.out.println(student);
        session.delete(student);
//        session.saveOrUpdate(student);
//        session.delete(student);
//        System.out.println(save+"====11111");
/**
 *     get  load : ����������ȡ����
 *     ��ͬ�㣺������ͬ�� �����б���ͬ�����ݴ���-->����ֵ��ͬ
 *     ��ͬ�㣺����ֵ���ݲ�ѯ�����ͬ��load ����  �׳��쳣
 *                                get ����  null
 */
//        Student student1 = (Student) session.load(Student.class, 1);
//        Student student2 = (Student) session.load(Student.class, 3);
//        Student student3 = (Student) session.get(Student.class,3);
//        System.out.println(student3);
//      HQL���
//        Query query = session.createQuery("from Student where id = 1");
//        Query query = session.createQuery("from Student "); ��ѯ����
//        Query query = session.createQuery("from Student where name = 'xiaowang'");
//        List list = query.list();
//        System.out.println(list);
//
//        SQLQuery sqlQuery = session.createSQLQuery("FROM student");
//        sqlQuery.list();

        transaction.commit();
//        session.close();
    }
}
