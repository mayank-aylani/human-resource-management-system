import java.util.*;
import java.text.*;
import com.earl.hr.dl.exceptions.*;
import com.earl.hr.dl.interfaces.dto.*;
import com.earl.hr.dl.interfaces.dao.*;
import com.earl.hr.dl.dao.*;
import com.earl.hr.dl.dto.*;
public class EmployeeGetByPANNumberTestCase
{
public static void main(String argv[])
{
if(argv.length!=1)
{
System.out.println();
System.out.println("Usage:"+"\u001B[32m"+" [EmployeeGetByPANNumberTestCase pan_number]"+"\u001B[0m");
System.exit(1);
}
String panNumber=argv[0];
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
EmployeeDTOInterface employeeDTO;
employeeDTO=employeeDAO.getByPANNumber(panNumber);
SimpleDateFormat simpleDateFormat;
simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
System.out.println("Employee Id : "+employeeDTO.getEmployeeId());
System.out.println("Name : "+employeeDTO.getName());
System.out.println("Designation Code : "+employeeDTO.getDesignationCode());
System.out.println("Date of birth : "+simpleDateFormat.format(employeeDTO.getDateOfBirth()));
System.out.println("Gender : "+employeeDTO.getGender());
System.out.println("Is Indian : "+employeeDTO.getIsIndian());
System.out.println("Basic salary : "+employeeDTO.getBasicSalary().toPlainString());
System.out.println("PAN Number : "+employeeDTO.getPANNumber());
System.out.println("Aadhar card number : "+employeeDTO.getAadharCardNumber());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}