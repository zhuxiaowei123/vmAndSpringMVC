package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
public class GeneralController {

    //默认跳转
    @RequestMapping(value = "/index.html")
    public void index_jsp(Model model) {
        model.addAttribute("str0121", "Hellow world");
        System.out.println("index1.jsp");

    }

    //返回json数据
    @ResponseBody
    @RequestMapping(value = "/index.json")
    public ModelAndView doJson(Model model) {
        model.addAttribute("str0121", "Hellow world");
        System.out.println("json");
        Map<String, String> map = new HashMap<String, String>();
        map.put("result", "success");
        return new ModelAndView(new MappingJackson2JsonView(), map);

    }
}
