package Action;
import Dao.HbnUtil;
import PO.Student;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import java.util.List;
import java.util.Map;
public class StudentAction extends ActionSupport implements SessionAware {
    private Session hbnsession;
    private Map<String,Object> session;
    List<Student> studentList;
    private int sid;
    private String pwd;
    private String name;
    private String sex;
    private String birthday;
    private String grade;
    private String major;
    private String department;
    public Student stu;
    List<String> deptList;
    public List<String> getDeptList() {
        hbnsession = HbnUtil.getSession();
        hbnsession.beginTransaction();
        String hql="select  department from Student ";//类名查询
        deptList= hbnsession.createQuery(hql).list();
        session.put("deptList",this.deptList);
        //session.put("studentList",this.studentList);
        hbnsession.getTransaction().commit();
        return deptList;
    }

    public void setDeptList(List<String> deptList) {
        this.deptList = deptList;
    }

    //@Test
    public String findALL(){//查询全部
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            String hql="from Student ";//类名查询
            studentList= hbnsession.createQuery(hql).list();
            System.out.println(studentList);
            session.put("studentList",this.studentList);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }

    }
    public String  find(){//模糊查询
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            String hql="from Student where  name like ?1";
            studentList=hbnsession.createQuery(hql).setParameter(1,"%"+stu.getName()+"%").list();
            System.out.println(studentList);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }

    }
    public String update(){//修改操作
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            System.out.println(stu);
            hbnsession.update(stu);
            session.put("studentList",this.studentList);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }
    }
    public String delete(){//操作
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            System.out.println(stu);
            hbnsession.delete(stu);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }
    }
   public String add() {//增加操作
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            System.out.println(stu);
            hbnsession.save(stu);
            session.put("studentList",this.studentList);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }

    }
    public String  Finddept(){//通过院系模糊查询
        try {
            System.out.println(stu.getDepartment());
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            String hql="from Student where  department like:name";
            studentList=hbnsession.createQuery(hql).setParameter("name","%"+stu.getDepartment()+"%").list();
            session.put("studentList",this.studentList);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }

    }
    public String  login(){//学生登陆查询
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            String hql="from Student where sid=?1 and pwd=?2";
            studentList=hbnsession.createQuery(hql).setParameter(1,this.getSid())
                    .setParameter(2,this.getPwd()).list();
            session.put("studentList",this.studentList);
            //System.out.println(studentList);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }
    }
    /*public String  find2(){//学生登陆查询自己信息
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            String hql="from Student where  sid =?1 ";
            studentList=hbnsession.createQuery(hql).setParameter(1,stu.getSid()).list();
            System.out.println(studentList);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }
    }
    public String  update2(){//学生登陆查询自己信息
        try {
            hbnsession = HbnUtil.getSession();
            hbnsession.beginTransaction();
            String s=stu.getPwd();
            hbnsession.update(s);
            hbnsession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            hbnsession.getTransaction().rollback();
            return "error";
        }

    }*/
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
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

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
