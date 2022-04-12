package edu.gdpu.mybatisdemo.dao;

import edu.gdpu.mybatisdemo.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> queryUsersByCondition(User user);
    public void updateUser(User user);
    public List<User> queryUsersByIds(List<Integer> ids);
}
