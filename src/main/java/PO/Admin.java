package PO;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
    private int aid;
    private String usrpwd;
    private String username;
    private String role;
    private String rolename;
    /*public Admin(String username,String usrpwd,String role,String rolename){
        this.username=username;
        this.usrpwd=usrpwd;
        this.role=role;
        this.rolename=rolename;
    }*/
    /*public Admin(String a_name,String a_pwd){
        this.a_name=a_name;
        this.a_pwd=a_pwd;
    }*/

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
@Basic

    public String getUsrpwd() {
        return usrpwd;
    }

    public void setUsrpwd(String usrpwd) {
        this.usrpwd = usrpwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aid=" + aid +
                ", usrpwd='" + usrpwd + '\'' +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
