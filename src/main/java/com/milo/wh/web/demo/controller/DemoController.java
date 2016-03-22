package com.milo.wh.web.demo.controller;

import com.milo.wh.domain.Demo;
import com.milo.wh.web.demo.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by marco on 2016-02-18.
 * @author marco
 */
@Slf4j
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Resource(name = "demoService")
    DemoService demoService;

    @RequestMapping(value = "/intro")
    public String intro(ModelMap model) {

        return "demo/intro.wh";
    }

    @RequestMapping(value = "/list")
    public String list(@ModelAttribute("demo") Demo demo, BindingResult bindingResult, ModelMap model) {

        List<Map<String, Object>> list = demoService.findList(demo);
        model.addAttribute("list", list);

        return "demo/list.wh";
    }

}
