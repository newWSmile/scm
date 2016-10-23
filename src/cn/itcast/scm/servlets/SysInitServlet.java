package cn.itcast.scm.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wyj on 2016/10/18.
 */
public class SysInitServlet extends HttpServlet {

    public void init() throws ServletException {
        Map<String,Object> sysParam = new HashMap<String,Object>();
        Map<String,String> supType = new HashMap<String,String>();
        supType.put("1", "普通供应商");
        supType.put("2", "一级供应商");
        supType.put("3", "二级供应商");

        Map<String,String> goodsColor = new HashMap<String,String>();
        goodsColor.put("red", "红色");
        goodsColor.put("green", "绿色");
        goodsColor.put("blue", "蓝色");

        sysParam.put("goodsColor", goodsColor);
        sysParam.put("supType", supType);
        ServletContext application =this.getServletContext();
        application.setAttribute("sysParam",sysParam);
        System.out.println("=======初始化完成，已加载数据字典数据=======");
    }
}