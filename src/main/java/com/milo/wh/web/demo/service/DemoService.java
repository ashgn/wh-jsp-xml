package com.milo.wh.web.demo.service;

import com.milo.wh.web.demo.dao.DemoDao;
import com.milo.wh.domain.Demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by marco on 2016-02-24.
 * @author marco
 */
@Slf4j
@Service(value = "demoService")
public class DemoService {

    @Resource(name = "demoDao")
    DemoDao demoDao;

    public List<Map<String, Object>> findList(Demo demo) {

        List<Map<String, Object>> result = demoDao.findUserAll();

        return result;
    }
}
