import com.earl.hr.dl.interfaces.dto.*;
import com.earl.hr.dl.interfaces.dao.*;
import com.earl.hr.dl.exceptions.*;
import com.earl.hr.dl.dto.*;
import com.earl.hr.dl.dao.*;
public class DesignationAddTestCase
{
public static void main(String argv[])
{
if(argv.length!=1)
{
System.out.println();
System.out.println("Usage:"+"\u001B[32m"+" [DesignationAddTestCase title]"+"\u001B[0m");
System.exit(1);
}
String title=argv[0];
try
{
DesignationDTOInterface designationDTO;
designationDTO=new DesignationDTO();
designationDTO.setTitle(title);
DesignationDAOInterface designationDAO;
designationDAO=new DesignationDAO();
designationDAO.add(designationDTO);
System.out.println("Designation : "+title+" added with code as "+designationDTO.getCode());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}