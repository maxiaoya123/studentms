package Action;

import Dao.HbnUtil;
import PO.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.annotations.Before;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
public class AdminAction extends ActionSupport implements SessionAware{
    private String username;
    private String usrpwd;
    private String role;
    private Session hbnsession;
    private Map<String,Object> session;
    //private Admin admin
    //@Test
    /*public void add(){
    Session session= HbnUtil.getSession();
        session.beginTransaction();
        Admin admin=new Admin();
         admin.setUsername("tom");
         admin.setUsrpwd("123");
         admin.setRole("1");
         admin.setRolename("教务处");
        //4事务处理
        //Transaction trans=session.beginTransaction();
        //5插入数据
        session.save(admin);
        //6提交
        session.getTransaction().commit();
        //session.close();
        //sf.close();
        System.out.println("add is OK!");

    }*/
    @Override
       public String execute() throws Exception {
        //唯一性查询
        String hql = "from Admin where username =?1 and usrpwd=?2 and role=?3";
        System.out.println(hql);
        hbnsession = HbnUtil.getSession();
        System.out.println(this.username);
        hbnsession.beginTransaction();
        Admin admin = (Admin) hbnsession.createQuery(hql)
                .setParameter(1, this.getUsername())
                .setParameter(2, this.getUsrpwd())
                .setParameter(3,this.getRole())
                .uniqueResult();
        System.out.println(admin);
        hbnsession.getTransaction().commit();
        if (admin == null) {
            System.out.println("admin is null!");
            return "login";
        } else {
            session.put("adminusername", admin.getUsername());
            System.out.println("adminusername is :" + admin.getUsername());
            return "success";

        }
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsrpwd() {
        return usrpwd;
    }

    public void setUsrpwd(String usrpwd) {
        this.usrpwd = usrpwd;
    }

    public Session getHbnsession() {
        return hbnsession;
    }

    public void setHbnsession(Session hbnsession) {
        this.hbnsession = hbnsession;
    }

    public Map<String, Object> getSession() {
        return session;
    }
@Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
