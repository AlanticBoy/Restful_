package com.enroll.service;

import com.enroll.POJO.Enrollment;
import com.enroll.common.BaseResult;
import com.enroll.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author:付风松
 * @Description:
 * @Date:Created in  10:44 2018/8/20
 * @ModefiedBy:
 */
@Service
public class UserServiceImp implements UserService {

   @Autowired
    private UserMapper userMapper;


    @Override
    public BaseResult getAllUsers() {
        List<Map<String, Object>> maps = userMapper.selectAllUsers();
        return BaseResult.success(maps);
    }

    @Override
    public BaseResult insertAItem(Enrollment enrollment) {
        return BaseResult.success(enrollment);
    }
}
