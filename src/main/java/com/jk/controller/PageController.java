/**
 * Copyright (C),2019, 金科教育
 * FileName: PageController
 * Author:   马法冲
 * Date:     2019/4/11 23:19
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author MC
 * @create 2019/4/11
 * @since 1.0.0
 */
@Controller
public class PageController {

    @RequestMapping("show")
    public String toMain(){
        return "main";
    }
    @RequestMapping("addUser")
    public String addUserPage(){
        return "add";
    }
    @RequestMapping("updateUser")
    public String updateUserPage(){
        return "update";
    }
}