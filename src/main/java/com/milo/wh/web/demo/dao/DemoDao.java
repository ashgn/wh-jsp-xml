package com.milo.wh.web.demo.dao;

import com.milo.wh.common.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by marco on 2016-03-22.
 */
@Repository(value = "demoDao")
public class DemoDao extends BaseDao {


    public List<Map<String,Object>> findUserAll() {

        return null;
    }
}
