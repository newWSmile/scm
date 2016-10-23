package testDao;

import cn.itcast.scm.entity.Dept;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wyj on 2016/10/12.
 */
public class testDeptDao {
//    private static DeptDaoImpl deptDao;
//    @BeforeClass
//    public static void setUpBeforeClass() throws Exception {
//        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
//        deptDao=(DeptDaoImpl) context.getBean("deptDao");
//    }
//
//    @AfterClass
//    public static void tearDownAfterClass() throws Exception {
//    }
//
//    @Test
//    public void testSelectDept() {
//        System.out.println(deptDao.selectDept(1));
//    }
//
//    @Test
//    public void testInsertDept() {
//        Dept dept=new Dept();
//        //dept.setDeptId(117);
//        dept.setDeptName("name117");
//        dept.setDeptAddress("address117");
//        try {
//            System.out.println("受 影响行数："+deptDao.insertDept(dept));
//
//        }catch (Exception e){
//
//        }
//    }
}
