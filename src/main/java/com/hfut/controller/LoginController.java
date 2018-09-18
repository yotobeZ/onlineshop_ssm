package com.hfut.controller;

import com.hfut.pojo.Userlog;
import com.hfut.service.UserlogMapperService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private Log log = LogFactory.getLog(this.getClass());

    @Autowired
    UserlogMapperService userlogMapperService;
    @RequestMapping(value="/prelogin",method = RequestMethod.GET)
    public String prelogin(@ModelAttribute("Userlog")Userlog userlog){
        log.info("进入预登陆");
        return "/login";
    }

    @RequestMapping(value="/preregister",method = RequestMethod.GET)
    public String preregister(@ModelAttribute("Userlog")Userlog userlog){
        log.info("进入预注册");
        return "/regist";
    }

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String insert(Userlog userlog,Model model) {
        userlogMapperService.insert(userlog);
        log.info("用户注册");
        return "/index3";
    }


    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@ModelAttribute("Userlog")Userlog userlog, Model model, HttpSession session){
        log.info("进入登陆");
        String url="";
        /**
         * 登陆判断
         */
        if(!userlogMapperService.login(userlog)){
            model.addAttribute("result","0");
            log.info("登陆失败");
            url="list/fail";
        }
        else{
            userlog=userlogMapperService.selectByExample(userlog).get(0);
            /**
             * 登陆权限判断
             */
            log.info(userlog.getLogLimit().toString());
            switch (userlog.getLogLimit()){
                case 0:{
                    url= "list/commodity";
                    log.info("买家");
                    break;
                }
                case 1:{
                    url= "list/manage";
                    log.info("管理员");
                    break;
                }

                default:
                    url="redirect:/index";
                    break;
            }
        }
        return url;
    }

}



