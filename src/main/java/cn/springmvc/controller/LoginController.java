package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//@RequestMapping
public class LoginController extends MultiActionController{

//    @RequestMapping
     public ModelAndView helloVm(HttpServletRequest request,
                                 HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("message", "Hello,Velocity");
        return modelAndView;
    }

//    @RequestMapping
    public ModelAndView index2(HttpServletRequest request,
                                HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index2");
        modelAndView.addObject("message", "Hello,Velocity");
        return modelAndView;
    }


}
