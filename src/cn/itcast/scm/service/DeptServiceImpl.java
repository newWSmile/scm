package cn.itcast.scm.service;

import cn.itcast.scm.dao.DeptDao;
import cn.itcast.scm.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wyj on 2016/10/12.
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public Dept selectDept(Integer deptId) {
        return deptDao.selectDept(deptId);
    }

    @Override
    public int insertDept(Dept dept) throws Exception {
//        int i = 0;
//        i=deptDao.insertDept(dept);
//        Integer.parseInt("aa");
        return deptDao.insertDept(dept);
    }
}
