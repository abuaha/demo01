package com.haoj.controller;

import com.opensymphony.xwork2.Action;


public class HelloAction3 implements Action {
    @Override
    public String execute() throws Exception{
        System.out.println("execute方法执行了");
        return SUCCESS;
    }
    public String sayHi1(){
        System.out.println("action4 的sayHi1执行了！");
        return "success";
    }
}
