import com.earl.hr.bl.managers.*;
import com.earl.hr.bl.interfaces.managers.*;
import com.earl.hr.bl.interfaces.pojo.*;
import com.earl.hr.bl.pojo.*;
import com.earl.hr.bl.exceptions.*;
import java.util.*;
class DesignationManagerAddTestCase
{
public static void main(String argv[])
{
if(argv.length!=1)
{
System.out.println();
System.out.println("Usage:"+"\u001B[32m"+" [DesignationManagerAddTestCase title]"+"\u001B[0m");
System.exit(1);
}
DesignationInterface designation=new Designation();
designation.setTitle(argv[0]);
try
{
DesignationManagerInterface designationManager;
designationManager=DesignationManager.getDesignationManager();
designationManager.addDesignation(designation);
System.out.println("Designation added with code as : "+designation.getCode());
}catch(BLException blException)
{
if(blException.hasGenericException())
{
System.out.println(blException.getGenericException());
}
List<String> properties=blException.getProperties();
for(String property:properties)
{
System.out.println(blException.getException(property));
}
}
}
}

