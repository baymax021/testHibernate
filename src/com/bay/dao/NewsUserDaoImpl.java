package com.bay.dao;

import com.bay.model.NewsUser;
import com.bay.util.MySessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
public class NewsUserDaoImpl implements NewsUserDao {
//    Session session = MySessionFactory.getSession();
//    Transaction transaction = session.beginTransaction();


    @Override
    public boolean queryNewsUser(String userName, String userPassword) {
        Session session = MySessionFactory.getSession();
        Query query = session.createQuery("from NewsUser where userName = '" + userName + "' and userPassword='" + userPassword+"'");
        List list = query.list();
        if(list.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public List<NewsUser> newsUserList() {
        Session session = MySessionFactory.getSession();
        Query query = session.createQuery("from NewsUser");
        List<NewsUser> list = query.list();
        return list;
    }

    @Override
    public void addOrUpdateNewsUser(NewsUser newsUser) {
        Session session = MySessionFactory.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(newsUser);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }

    }



    @Override
    public void deleteNewsUser(NewsUser newsUser) {
        Session session = MySessionFactory.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(newsUser);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
    }

    @Override
    public NewsUser queryNewsUserById(Integer id) {
        Session session = MySessionFactory.getSession();
        return (NewsUser) session.load(NewsUser.class,id);
    }
}
