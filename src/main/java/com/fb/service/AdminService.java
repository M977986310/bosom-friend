package com.fb.service;

import com.fb.entity.Post;
import com.fb.entity.User;

import java.util.List;
import java.util.Map;

public interface AdminService {
    List<Map<String, Object>> selectAdmin(String userName, String passWord);

    void addUser(User user);

    List<Map<String,Object>> showUserInfo();

    void delUser(String id);

    List<Map<String,Object>> showUserInfoById(String id);

    void updateUser(User user);

    List<Map<String,Object>> showNewsList();

    void updateNewsStatus(String[] idList);

    List<Map<String,Object>> searchNewsOnUpdate(String id);

    void subUpdateInfo(Post post);

    void delNews(String id);

    List<Map<String,Object>> getAllNews();

    Integer amountOfUsers();

    Integer getUserMessageNumber();

    void editUser(User user);
}
