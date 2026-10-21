import java.util.*;
import java.text.*;
import com.earl.hr.dl.exceptions.*;
import com.earl.hr.dl.interfaces.dto.*;
import com.earl.hr.dl.interfaces.dao.*;
import com.earl.hr.dl.dao.*;
import com.earl.hr.dl.dto.*;
public class EmployeeGetAllTestCase
{
public static void main(String argv[])
{
try
{
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
Set<EmployeeDTOInterface> employees;
employees=employeeDAO.getAll();
SimpleDateFormat simpleDateFormat;
simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
for(EmployeeDTOInterface employeeDTO:employees)
{
System.out.println("Employee Id : "+employeeDTO.getEmployeeId());
System.out.println("Name : "+employeeDTO.getName());
System.out.println("Designation Code : "+employeeDTO.getDesignationCode());
System.out.println("Date of birth : "+simpleDateFormat.format(employeeDTO.getDateOfBirth()));
System.out.println("Gender : "+employeeDTO.getGender());
System.out.println("Is Indian : "+employeeDTO.getIsIndian());
System.out.println("Basic salary : "+employeeDTO.getBasicSalary().toPlainString());
System.out.println("PAN Number : "+employeeDTO.getPANNumber());
System.out.println("Aadhar card number : "+employeeDTO.getAadharCardNumber());
System.out.println("**************************************");
}
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}