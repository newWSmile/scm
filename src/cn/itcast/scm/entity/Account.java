package cn.itcast.scm.entity;

import java.io.Serializable;

/**
 * Created by wyj on 2016/10/12.
 */
public class Account implements Serializable {
    private Integer accId;
    private String  accLogin;
    private String  accName;
    private String  accPass;

    public String getAccLogin() {
        return accLogin;
    }

    public void setAccLogin(String accLogin) {
        this.accLogin = accLogin;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccPass() {
        return accPass;
    }

    public void setAccPass(String accPass) {
        this.accPass = accPass;
    }

    @Override
    public String toString() {
        return accId+","+accLogin+","+accName+","+accPass;
    }
}
