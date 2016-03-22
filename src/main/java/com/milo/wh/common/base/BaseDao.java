package com.milo.wh.common.base;

import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;

/**
 * Created by marco on 2016-03-22.
 * @author marco
 */
public class BaseDao {

    @Resource(name = "sqlSession")
    protected SqlSession sqlSession;
}
