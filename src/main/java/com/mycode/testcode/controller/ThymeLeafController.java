package com.mycode.testcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName ThymeLeafController
 * Description: TODO
 * @Author dailiuyang
 * @Date 2019/7/30 10:34
 **/
@Controller
public class ThymeLeafController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "show";
    }

    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public String export(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "excellexport";
    }


    @RequestMapping(value = "/sheetJS", method = RequestMethod.GET)
    public String sheetJS(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "sheetJS";
    }
}
