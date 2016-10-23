package cn.itcast.scm.service;

import cn.itcast.scm.entity.Page;
import cn.itcast.scm.dao.SupplierMapper;
import cn.itcast.scm.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by wyj on 2016/10/13.
 */

@Service("supplierService")  //这里一定要注意要在实现类上加@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired //也可以用@Resource但是效率稍微差一点
    private SupplierMapper supplierMapper;

    @Override
    public int insert(Supplier supplier) throws Exception {
        return supplierMapper.insert(supplier);
    }

    @Override
    public int update(Supplier entyty) throws Exception {
        return 0;
    }

    @Override
    public int delete(Supplier entity) throws Exception {
        return 0;
    }

    @Override
    public int deleteList(String[] pks) throws Exception {
        return supplierMapper.deleteList(pks);
    }

    @Override
    public Supplier select(Supplier entity) throws Exception {
        return null;
    }
    @Override
    public Page<Supplier> selectPage(Page<Supplier> page) {
        // TODO Auto-generated method stub
        page.setList(supplierMapper.selectPageList(page));
        page.setTotalRecord(supplierMapper.selectPageCount(page));
        return page;
    }

    @Override
    public Page<Supplier> selectPageUseDyc(Page<Supplier> page) {
        // TODO Auto-generated method stub
        page.setList(supplierMapper.selectPageListUseDyc(page));
        page.setTotalRecord(supplierMapper.selectPageCountUseDyc(page));
        return page;
    }



}
