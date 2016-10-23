package cn.itcast.scm.dao;

import cn.itcast.scm.entity.Account;

/**
 * Created by wyj on 2016/10/13.
 */
public interface AccountMapper extends BaseMapper<Account> {
    public Account login(Account account);
}
