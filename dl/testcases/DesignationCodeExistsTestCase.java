import com.earl.hr.dl.exceptions.*;
import com.earl.hr.dl.interfaces.dao.*;
import com.earl.hr.dl.dao.*;
public class DesignationCodeExistsTestCase
{
public static void main(String gg[])
{
int code=Integer.parseInt(gg[0]);
try
{
DesignationDAOInterface designationDAO;
designationDAO=new DesignationDAO();
System.out.println(code+" exists : "+designationDAO.codeExists(code));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}