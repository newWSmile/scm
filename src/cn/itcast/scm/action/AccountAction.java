package cn.itcast.scm.action;

import cn.itcast.scm.entity.Account;
import cn.itcast.scm.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by wyj on 2016/10/13.
 */
@Controller
@RequestMapping("/account")
public class AccountAction extends BaseAction {
    @Resource
    private AccountService accountService;
    @RequestMapping("/login")
    public String login(Account account, HttpServletRequest request, HttpSession session){
        System.out.println("login---"+account);
        Account account1 = accountService.login(account);//返回一个带有全部信息的对象
        if(account1!=null){
            //存session
            session.setAttribute("account",account1);
            return "forward:/WEB-INF/main/main.jsp";
        }else {
            //返回的对象为空时
            request.setAttribute("msg","用户名或者密码错误");
            return "forward:/login.jsp";
        }

    }
}
