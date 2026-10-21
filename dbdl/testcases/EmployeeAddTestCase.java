import com.earl.hr.dl.exceptions.*;
import com.earl.hr.dl.dao.*;
import com.earl.hr.dl.dto.*;
import com.earl.hr.dl.interfaces.dao.*;
import com.earl.hr.dl.interfaces.dto.*;
import java.util.*;
import java.math.*;
import java.text.*;
import com.earl.enums.*;
public class EmployeeAddTestCase
{
public static void main(String argv[])
{
String name=argv[0];
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
int designationCode=Integer.parseInt(argv[1]);
Date dateOfBirth=null;
try
{
dateOfBirth=sdf.parse(argv[2]);
}catch(ParseException pe)
{
System.out.println(pe.getMessage());
return;
}
char gender=argv[3].charAt(0);
boolean isIndian=Boolean.parseBoolean(argv[4]);
BigDecimal basicSalary=new BigDecimal(argv[5]);
String panNumber=argv[6];
String aadharCardNumber=argv[7];
try
{
EmployeeDTOInterface employeeDTO;
employeeDTO=new EmployeeDTO();
employeeDTO.setName(name);
employeeDTO.setDesignationCode(designationCode);
employeeDTO.setDateOfBirth(dateOfBirth);
if(gender=='M')
{
employeeDTO.setGender(GENDER.MALE);
}
if(gender=='F')
{
employeeDTO.setGender(GENDER.FEMALE);
}
employeeDTO.setIsIndian(isIndian);
employeeDTO.setBasicSalary(basicSalary);
employeeDTO.setPANNumber(panNumber);
employeeDTO.setAadharCardNumber(aadharCardNumber);
EmployeeDAOInterface employeeDAO;
employeeDAO=new EmployeeDAO();
employeeDAO.add(employeeDTO);
System.out.println("Employee added with employeeId as : "+employeeDTO.getEmployeeId());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}