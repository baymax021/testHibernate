package com.bay.service;

import com.bay.dao.NewsUserDao;
import com.bay.dao.NewsUserDaoImpl;
import com.bay.model.NewsUser;

import java.util.List;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
public class NewsUserServiceImpl implements NewsUserService {
    private NewsUserDao newsUserDao;

    public NewsUserServiceImpl() {
        newsUserDao = new NewsUserDaoImpl();
    }

    @Override
    public boolean queryNewsUser(String userName, String userPassword) {
        return newsUserDao.queryNewsUser(userName,userPassword);
    }

    @Override
    public List<NewsUser> newsUserList() {
        return newsUserDao.newsUserList();
    }

    @Override
    public void addNewsUser(NewsUser newsUser) {
        newsUserDao.addOrUpdateNewsUser(newsUser);
    }

    @Override
    public void updateNewsUser(NewsUser newsUser) {
        newsUserDao.addOrUpdateNewsUser(newsUser);
    }

    @Override
    public void deleteNewsUser(NewsUser newsUser) {
        newsUserDao.deleteNewsUser(newsUser);
    }

    @Override
    public NewsUser queryNewsUserById(Integer id) {
        return newsUserDao.queryNewsUserById(id);
    }
}
