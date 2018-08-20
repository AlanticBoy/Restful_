package com.enroll.service;

import com.enroll.POJO.Enrollment;
import com.enroll.common.BaseResult;

/**
 * @Author:付风松
 * @Description:
 * @Date:Created in  10:44 2018/8/20
 * @ModefiedBy:
 */
public interface UserService {
    BaseResult getAllUsers();

    BaseResult insertAItem(Enrollment enrollment);
}
