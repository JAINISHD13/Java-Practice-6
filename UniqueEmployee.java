import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee
{
	private String name;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	Employee(int id, String name)
	{
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
    public int hashCode() {
        return this.id;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            return ((Employee) obj).id == id;
        }
        return false;
    }
}

public class UniqueEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1,"jainish");
		Employee emp2 = new Employee(2,"ravi");
		Employee emp3 = new Employee(1,"jainish");
		Employee emp4 = new Employee(3,"kustubh");
		Employee emp5 = new Employee(1,"jainish");
		
		List<Employee> list = new ArrayList();
		
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		System.out.println("Employee Name list:");
		for(Employee name: list)
		{
			System.out.print(" "+name.getName());
		}
		
		HashSet<Employee> set = new HashSet(list);
		System.out.println();
		System.out.println();
		System.out.println("Unique values by converting to into set:");
		
		for(Employee employee: set)
		{
			System.out.println(" "+employee.getName());
		}
		
	}

}
