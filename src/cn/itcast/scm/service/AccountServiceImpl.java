package cn.itcast.scm.service;

import cn.itcast.scm.dao.AccountMapper;
import cn.itcast.scm.entity.Page;
import cn.itcast.scm.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wyj on 2016/10/13.
 */
@Service("/accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public int insert(Account entity) throws Exception {
        return 0;
    }

    @Override
    public int update(Account entyty) throws Exception {
        return 0;
    }

    @Override
    public int delete(Account entity) throws Exception {
        return 0;
    }

    @Override
    public int deleteList(String[] pks) throws Exception {
        return 0;
    }

    @Override
    public Account select(Account entity) throws Exception {
        return null;
    }

    @Override
    public Page<Account> selectPage(Page<Account> page) {
        return null;
    }

    @Override
    public Page<Account> selectPageUseDyc(Page<Account> page) {
        return null;
    }

    //    实现用户登录
    @Override
    public Account login(Account account) {
        return accountMapper.login(account);
    }
}
