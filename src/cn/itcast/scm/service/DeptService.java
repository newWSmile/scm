package cn.itcast.scm.service;

import cn.itcast.scm.entity.Dept;

/**
 * Created by wyj on 2016/10/12.
 */
public interface DeptService {
    /**
     * 根据部门编号查询部门信息
     * @param deptId 部门编号
     * @return 部门信息
     */
    public Dept selectDept(Integer deptId);
    /**
     * 添加部门信息
     * @param dept 部门信息
     * @return 添加成功的记录数
     */
    public int insertDept(Dept dept) throws Exception;
}
