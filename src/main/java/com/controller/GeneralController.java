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

    @RequestMapping(value = "/home.html")
    public void home(Model model) {
        model.addAttribute("str0121", "Hellow world");
        model.addAttribute("content", "this is the content of shu");
        System.out.println("volecity test");

    }

    @RequestMapping(value = "/index.html")
    public String home_velocity(Model model) {
        model.addAttribute("str0121", "Hellow world");
        model.addAttribute("content", "this is the content of shu");
        System.out.println("jsp test");
        return "index";

    }

    @RequestMapping(value = "/index.jsp")
    public String jsp(Model model) {
        model.addAttribute("str0121", "Hellow world");
        model.addAttribute("content", "this is the content of shu");
        System.out.println("jsp2 test");
        return "index";

    }

    @ResponseBody
    @RequestMapping(value = "/test.json")
    public ModelAndView doJson(Model model) {
        Map<String, String> result = new HashMap<String, String>();
        result.put("test1", "test1");
        result.put("test2", "test2");

        model.addAttribute("success", true);
        model.addAttribute("result", result);
        return new ModelAndView(new MappingJackson2JsonView(), null);

    }
}
