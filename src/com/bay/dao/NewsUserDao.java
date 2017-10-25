package com.bay.dao;

import com.bay.model.NewsUser;

import java.util.List;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
public interface NewsUserDao {
    boolean queryNewsUser(String userName, String userPassword);
    List<NewsUser> newsUserList();
    void addOrUpdateNewsUser(NewsUser newsUser);

    void deleteNewsUser(NewsUser newsUser);
    NewsUser queryNewsUserById(Integer id);
}
