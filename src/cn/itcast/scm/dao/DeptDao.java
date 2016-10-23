package cn.itcast.scm.dao;

import cn.itcast.scm.entity.Dept;

/**
 * Created by wyj on 2016/10/12.
 */
public interface DeptDao {
    public Dept selectDept(Integer deptId);

    public int insertDept(Dept dept) throws Exception;
}
