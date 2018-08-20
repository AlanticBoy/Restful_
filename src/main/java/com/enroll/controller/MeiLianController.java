package com.enroll.controller;

import com.enroll.common.BaseResult;
import com.enroll.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:付风松
 * @Description:
 * @Date:Created in  10:42 2018/8/20
 * @ModefiedBy:
 */
@Controller
@RequestMapping(value = "/meilian")
public class MeiLianController {

    Logger logger = LoggerFactory.getLogger(MeiLianController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllUsers", method = {RequestMethod.GET})
    public @ResponseBody
    BaseResult getAllUsers() {
        logger.info("enter Method getAllUsers");
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/receiveParam/{param}", method = {RequestMethod.GET})
    public @ResponseBody
    BaseResult receiveParam(@PathVariable String param) {
        logger.info("enter Method receiveParam");
        return BaseResult.success(param);
    }
}
