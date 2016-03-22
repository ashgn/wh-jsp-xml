package com.milo.wh.web.main.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marco on 2016-03-14.
 * @author marco
 */
@Slf4j
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/")
    public String index(Model model) {

        return "main/index";
    }

    @RequestMapping(value = "/list")
    public String list(Model model) {

        return "main/list";
    }
}
