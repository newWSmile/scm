package cn.itcast.scm.action;

import cn.itcast.scm.entity.Dept;
import cn.itcast.scm.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by wyj on 2016/10/12.
 */
@Controller
@RequestMapping("/dept")
public class DeptAction {
    @Resource
    private DeptService deptService;
    @RequestMapping(value = "/insert")
    public String insert(Dept dept){
        System.out.println("--action.dept"+dept);
        try {
            deptService.insertDept(dept);
        }catch (Exception e){
//            throw new RuntimeException(e.getMessage(),e);
            System.out.println("出异常了，回滚了吗？" +e.getMessage());
        }
        return "forward:/jsp/main.jsp";
    }
}
