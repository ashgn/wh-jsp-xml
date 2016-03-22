package com.milo.wh.rest.demo.service;

import com.milo.wh.domain.Demo;
import com.milo.wh.rest.demo.dao.DemoRestDao;
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
@Service(value = "demoRestService")
public class DemoRestService {

    @Resource(name = "demoRestDao")
    DemoRestDao demoRestDao;

    public List<Map<String, Object>> findList(Demo demo) {

        List<Map<String, Object>> result = demoRestDao.findUserAll();
        return result;
    }
}
