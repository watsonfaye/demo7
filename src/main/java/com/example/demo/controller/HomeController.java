package com.example.demo.controller;

import com.example.demo.pojo.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Api(tags = "HomeController控制类")
public class HomeController {
    @GetMapping("/")
    @ApiOperation(value = "跳转首页",response =String.class,notes = "这是跳转首页详细信息...")
    public String goHome() {
        return  "index";
    }


    @GetMapping("/person")
    @ApiOperation(value = "获得所有用户",response =Person.class,notes = "这是详细信息...")
    @ResponseBody
    public List<Person> getPerson() {
        return new ArrayList<>(Arrays.asList(new Person("浩宇",18)));
    }


}
