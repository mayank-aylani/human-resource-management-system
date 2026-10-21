import com.earl.hr.bl.managers.*;
import com.earl.hr.bl.interfaces.managers.*;
import com.earl.hr.bl.interfaces.pojo.*;
import com.earl.hr.bl.pojo.*;
import com.earl.hr.bl.exceptions.*;
import com.earl.enums.*;
import java.util.*;
import java.text.*;
import java.math.*;
class EmployeeManagerAddTestCase
{
public static void main(String argv[])
{
if(argv.length!=8)
{
System.out.println();
System.out.println("Usage:"+"\u001B[32m"+" [EmployeeManagerAddTestCase name_of_employee designation_code_to_be_alloted date_of_birth gender(M/F) is_indian(True/False) basic_salary pan_number aadhar_card_number]"+"\u001B[0m");
System.out.println();
System.out.println("\u001B[31m"+"NOTE:"+"\u001B[0m"+" Designation code should be strictly available in file designation.data");
System.exit(1);
}
try
{
String name=argv[0];
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
DesignationInterface designation=new Designation();
designation.setCode(Integer.parseInt(argv[1]));
Date dateOfBirth=new Date();
try{
dateOfBirth=sdf.parse(argv[2]);
}catch(ParseException pe)
{
System.out.println(pe);
}
char gender=argv[3].charAt(0);
boolean isIndian=Boolean.parseBoolean(argv[4]);
BigDecimal basicSalary=new BigDecimal(argv[5]);
String panNumber=argv[6];
String aadharCardNumber=argv[7];
EmployeeInterface employee;
employee=new Employee();
employee.setName(name);
employee.setDesignation(designation);
employee.setDateOfBirth(dateOfBirth);
if(gender=='M')
{
employee.setGender(GENDER.MALE);
}
if(gender=='F')
{
employee.setGender(GENDER.FEMALE);
}
employee.setIsIndian(isIndian);
employee.setBasicSalary(basicSalary);
employee.setPANNumber(panNumber);
employee.setAadharCardNumber(aadharCardNumber);
EmployeeManagerInterface employeeManager;
employeeManager=EmployeeManager.getEmployeeManager();
employeeManager.addEmployee(employee);
System.out.printf("Employee added with employee Id. %s\n",employee.getEmployeeId());
}catch(BLException blException)
{
if(blException.hasGenericException()) System.out.println(blException.getGenericException());
List<String> properties=blException.getProperties();
for(String property:properties)
{
System.out.println(blException.getException(property));
}
}
}
}