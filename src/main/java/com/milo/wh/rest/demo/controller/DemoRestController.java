package com.milo.wh.rest.demo.controller;

import com.milo.wh.rest.demo.service.DemoRestService;
import com.milo.wh.domain.Demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by marco on 2016-03-18.
 * @author marco
 */
@Slf4j
@RestController(value = "demoRestController")
@RequestMapping("/demorest")
public class DemoRestController {

    @Resource
    DemoRestService demoRestService;

    @RequestMapping(value = "/list", produces = "application/json; charset=utf8", method = RequestMethod.GET)
    public String list(@ModelAttribute("demo") Demo demo, BindingResult bindingResult, ModelMap model) {

        List<Map<String, Object>> list = demoRestService.findList(demo);
        model.addAttribute("list", list);

        return list.toString();
    }
}
