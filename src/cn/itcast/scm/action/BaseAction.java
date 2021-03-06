package cn.itcast.scm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletContext;

/**
 * Created by wyj on 2016/10/13.
 */
@Controller
@RequestMapping("/base")
public class BaseAction {
    @Autowired
    ServletContext application;

    //方法参数folder通过@PathVariable指定其值可以从@RequestMapping的{folder}获取，同理file也一样
    @RequestMapping("/goURL/{folder}/{file}")
    public String goURL(@PathVariable String folder, @PathVariable String file) {
        System.out.println("goURL.folder|file==="+folder+"/"+file);
        return "forward:/WEB-INF/"+folder+"/"+file+".jsp";
    }

}

