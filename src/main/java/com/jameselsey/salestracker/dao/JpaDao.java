package com.jameselsey.salestracker.dao;

import java.util.List;
import java.util.Map;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.dao.IncorrectResultSizeDataAccessException;

public class JpaDao extends JpaDaoSupport
{
    protected <T> List<T> findAll(Class<T> clazz)
    {
        return getJpaTemplate().find("select c from " + clazz.getName() + " c");
    }
    protected <T> T findOne(String jpql, Map params)
    {
        List<T> results = getJpaTemplate().findByNamedParams(jpql, params);
        if(results.isEmpty())
        {
            return null;
        }
        if(results.size() > 1)
        {
            throw new IncorrectResultSizeDataAccessException(1, results.size());
        }
        return results.get(0);
    }
}