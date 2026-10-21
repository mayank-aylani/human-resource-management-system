import com.earl.hr.dl.exceptions.*;
import com.earl.hr.dl.dao.*;
import com.earl.hr.dl.dto.*;
import com.earl.hr.dl.interfaces.dao.*;
import com.earl.hr.dl.interfaces.dto.*;
import java.util.*;
import java.math.*;
import java.text.*;
import com.earl.enums.*;
public class EmployeeUpdateTestCase
{
public static void main(String argv[])
{
if(argv.length!=8)
{
System.out.println();
System.out.println("Usage:"+"\u001B[32m"+" [EmployeeUpdateTestCase employee_id name_of_employee designation_code_to_be_alloted date_of_birth gender(M/F) is_indian(True/False) basic_salary pan_number aadhar_card_number]"+"\u001B[0m");
System.out.println();
System.out.println("\u001B[31m"+"NOTE:"+"\u001B[0m"+" Employee id. is used to update the employee hence it should strictly match with the employee id alloted to employee in employee.data");
System.out.println();
System.out.println("\u001B[31m"+"NOTE:"+"\u001B[0m"+" Designation code should be strictly available in file designation.data");
System.exit(1);
}
String employeeId=argv[0];
String name=argv[1];
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
int designationCode=Integer.parseInt(argv[2]);
Date dateOfBirth=null;
try
{
dateOfBirth=sdf.parse(argv[3]);
}catch(ParseException pe)
{
System.out.println(pe.getMessage());
return;
}
char gender=argv[4].charAt(0);
boolean isIndian=Boolean.parseBoolean(argv[5]);
BigDecimal basicSalary=new BigDecimal(argv[6]);
String panNumber=argv[7];
String aadharCardNumber=argv[8];
try
{
EmployeeDTOInterface employeeDTO;
employeeDTO=new EmployeeDTO();
employeeDTO.setEmployeeId(employeeId);
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
employeeDAO.update(employeeDTO);
System.out.println("Employee Updated");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}