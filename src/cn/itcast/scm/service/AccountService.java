package cn.itcast.scm.service;

import cn.itcast.scm.entity.Account;

/**
 * Created by wyj on 2016/10/13.
 */
public interface AccountService extends BaseService<Account> {
    public Account login(Account account);
}
