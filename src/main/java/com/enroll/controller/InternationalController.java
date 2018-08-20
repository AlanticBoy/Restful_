package com.enroll.controller;

import com.enroll.POJO.Enrollment;
import com.enroll.common.BaseResult;
import com.enroll.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:付风松
 * @Description:
 * @Date:Created in  16:02 2018/8/20
 * @ModefiedBy:
 */
@RestController
@RequestMapping("/inter")
public class InternationalController {

    Logger logger = LoggerFactory.getLogger(InternationalController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUsers")
    public BaseResult getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/insertAItem")
    public BaseResult insertAItem(Enrollment enrollment){
        System.out.println(" enter ");
        return userService.insertAItem(enrollment);
    }
}
