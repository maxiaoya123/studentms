package Action;

import IstudentDao.IsudentDao;
import PO.Student1;
import org.hibernate.Session;

import java.util.Map;

public class StudentDaoImpl implements IsudentDao {
    private Student1 student;
    private Session hbnsession;
    private Map<String,Object> session;
    @Override
    public void savestudent() {

    }

    @Override
    public void updatestudent() {

    }

    @Override
    public void insertstudent() {

    }

    @Override
    public void searchstudent() {

    }
}
