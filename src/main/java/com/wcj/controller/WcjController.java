package com.wcj.controller;

import com.wcj.entity.WcjUser;
import com.wcj.service.WcjUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WcjController {
    @Autowired
    private WcjUserService wcjUserService;
    @RequestMapping("/getall")
    public ModelAndView getall(){
      List users =wcjUserService.getall();
      ModelAndView modelAndView =new ModelAndView();
      modelAndView.addObject("users",users);
      modelAndView.setViewName("index");
      return modelAndView;
    }
    @RequestMapping("/getone")
    public ModelAndView getbyid(@RequestParam(required = false,name="id")String id, HttpServletRequest request){
        WcjUser user=  wcjUserService.getbyId(id);
        ModelAndView modelAndView= new ModelAndView();
        if(user!=null){
        modelAndView.addObject("user",user);
        MappingJackson2JsonView jsonView=new MappingJackson2JsonView();
        modelAndView.setView(jsonView);
        }else {
            modelAndView.addObject("message","没有该用户");
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }
}
