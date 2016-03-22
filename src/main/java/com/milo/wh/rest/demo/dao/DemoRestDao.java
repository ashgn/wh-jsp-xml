package com.milo.wh.rest.demo.dao;

import com.milo.wh.common.base.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by marco on 2016-03-22.
 */
@Repository(value = "demoRestDao")
public class DemoRestDao extends BaseDao {

    public List<Map<String,Object>> findUserAll() {
        return null;
    }
}
