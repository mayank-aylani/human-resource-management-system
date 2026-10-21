import java.util.*;
import java.text.*;
import com.earl.hr.dl.exceptions.*;
import com.earl.hr.dl.interfaces.dto.*;
import com.earl.hr.dl.interfaces.dao.*;
import com.earl.hr.dl.dao.*;
import com.earl.hr.dl.dto.*;
public class EmployeeDeleteTestCase
{
public static void main(String argv[])
{
if(argv.length!=1)
{
System.out.println();
System.out.println("Usage:"+"\u001B[32m"+" [EmployeeDeleteTestCase employee_id]"+"\u001B[0m");
System.out.println();
System.out.println("\u001B[31m"+"NOTE:"+"\u001B[0m"+" Designation code should be strictly available in file designation.data");
System.exit(1);
}
String employeeId=argv[0];
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
employeeDAO.delete(employeeId);
System.out.println("Employee deleted.");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}