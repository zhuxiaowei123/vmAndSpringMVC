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

    @RequestMapping(value = "/index.html")
    public void index_jsp(Model model) {
        model.addAttribute("str0121", "Hellow world");
        model.addAttribute("content", "this is the content of shu");
        System.out.println("index1.jsp");

    }

    @RequestMapping(value = "/home.html")
    public void home_velocity(Model model) {
        model.addAttribute("str0121", "Hellow world");
        model.addAttribute("content", "this is the content of shu");
        System.out.println("index1.jsp");

    }

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
