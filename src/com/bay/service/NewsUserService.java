package com.bay.service;

import com.bay.model.NewsUser;

import java.util.List;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
public interface NewsUserService {
    boolean queryNewsUser(String userName, String userPassword);
    List<NewsUser> newsUserList();
    void addNewsUser(NewsUser newsUser);
    void updateNewsUser(NewsUser newsUser);
    void deleteNewsUser(NewsUser newsUser);
    NewsUser queryNewsUserById(Integer id);
}
