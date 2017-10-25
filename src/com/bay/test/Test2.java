package com.bay.test;

import com.bay.dao.NewsUserDao;
import com.bay.dao.NewsUserDaoImpl;
import com.bay.model.NewsUser;
import com.bay.service.NewsUserService;
import com.bay.service.NewsUserServiceImpl;

import java.util.List;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */
public class Test2 {
    public static void main(String[] args) {
        NewsUserService newsUserService = new NewsUserServiceImpl();
        NewsUser newsUser = newsUserService.queryNewsUserById(9);
        newsUser.setUserName("111");
        newsUser.setUserPassword("222");
        newsUser.setUserType("and");
        System.out.println(newsUser);
        newsUserService.updateNewsUser(newsUser);

    }
}
