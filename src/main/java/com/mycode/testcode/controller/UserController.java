package com.mycode.testcode.controller;

import com.mycode.testcode.entity.User;
import com.mycode.testcode.result.GlobalErrorInfoEnum;
import com.mycode.testcode.result.GlobalErrorInfoException;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * Description: RESTFUL api
 * @Author dailiuyang
 * @Date 2019/7/29 19:31
 **/

@RestController
@RequestMapping(value="/users")
public class UserController {

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public String getUser(@PathVariable Long id) {
        return "ok";
    }


    @RequestMapping(value = "/data",method = RequestMethod.GET)
    @ResponseBody
    public List<User> data() throws GlobalErrorInfoException {
        if(true){
            throw new GlobalErrorInfoException(GlobalErrorInfoEnum.NOT_FOUND);
        }
        User user=new User();
        user.setKey("2");
        user.setGender("女");
        user.setName("小美");
        List users=new ArrayList<User>();
        users.add(user);
        return users;
    }



}
