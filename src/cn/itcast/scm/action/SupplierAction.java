package cn.itcast.scm.action;

import cn.itcast.scm.entity.Page;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by wyj on 2016/10/13.
 */
@Controller
@RequestMapping("/supplier")
public class SupplierAction extends BaseAction  {
    @Resource
    private SupplierService supplierService;
    @RequestMapping("/insert")
    @ResponseBody
    public Object insert(Supplier supplier){
        System.out.println("--action.supplier::::"+supplier);
        int i= 0;
        try {
           i = supplierService.insert(supplier);
        }catch (Exception e){
           e.printStackTrace();
        }
        return i;
    }

    @RequestMapping("/deleteList")
    @ResponseBody
    public int deleteList(String[] pks){
        int i = 0;
        try {
            i = supplierService.deleteList(pks);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    @RequestMapping("/doAjax")
    @ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
    public Object doAjax(Supplier supplier){
        System.out.println("---doAjax.supplier:"+supplier);
        supplier.setSupName("supName1");
        supplier.setSupPhone("66666");
        return supplier;
    }
    //通过关键字分页查询
    @RequestMapping("/selectPage")
    @ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
    public Object selectPage(Page<Supplier> page){
        Page p = supplierService.selectPage(page);
        System.out.println("----page:"+page);
        //supplier.setSupName("supName1");
		/*Map<String, Object> map =new HashMap<String, Object>();
		map.put("total",p.getTotalRecord());
		map.put("rows",p.getList());*/
        return page.getPageMap();
    }

    //通过关键字分页查询
    @RequestMapping("/selectPageUseDyc")
    @ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
    public Object selectPageUseDyc(Page<Supplier> page,Supplier supplier){

        page.setParamEntity(supplier);
        System.out.println("----page:"+page);

        Page p = supplierService.selectPageUseDyc(page);
        //supplier.setSupName("supName1");
		/*Map<String, Object> map =new HashMap<String, Object>();
		map.put("total",p.getTotalRecord());
		map.put("rows",p.getList());*/
        return p.getPageMap();
    }

}