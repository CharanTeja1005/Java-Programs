import java.util.*;  
  
class Employee implements Comparable<Employee>
{  
      
    int empId;  
    String name;  

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    String getName()  
    {  
        return this.name;  
    }  
    
    void setName(String name)  
    {  
        this.name = name;  
    }  
    
    void setId(int a)  
    {  
        this.empId = a;  
    }  
    
    int getId()  
    {  
        return this.empId;  
    }  
  
    @Override
    public int compareTo(Employee e)
    {
        return empId != e.empId ? name.compareTo(e.name) : empId - e.empId;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + "]";
    }
}  
  
public class Program16  
{  
  
    public static void main(String[] argvs)  
    {  
        Employee obj1 = new Employee(2, "Charan");  
        Employee obj2 = new Employee(2, "Abhi");
        Employee obj3 = new Employee(1, "Nagarjuna");
        Employee obj4 = new Employee(4, "Arjuna");
        
        TreeSet<Employee> ts =  new TreeSet<Employee>();
        
        ts.add(obj1);  
        ts.add(obj2);  
        ts.add(obj3);
        ts.add(obj4);
        
        System.out.println("TreeSet: " + ts);  
    }  
}  
