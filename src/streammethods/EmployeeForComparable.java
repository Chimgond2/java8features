package streammethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class EmployeeForComparable implements Comparable<EmployeeForComparable>{
	
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeForComparable [id=" + id + ", name=" + name + "]";
	}
	public EmployeeForComparable(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeForComparable other = (EmployeeForComparable) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(EmployeeForComparable o) {
		return this.name.compareToIgnoreCase(o.name);
	}
	
	
	///////////////////////////////////
public static void main(String[] args) {
		
		List<EmployeeForComparable> list=new ArrayList<EmployeeForComparable>();
		EmployeeForComparable e1=new EmployeeForComparable(1, "chadu");
		EmployeeForComparable e2=new EmployeeForComparable(5, "anand");
		EmployeeForComparable e3=new EmployeeForComparable(3, "khaja");
		EmployeeForComparable e4=new EmployeeForComparable(6, "bheem");
		EmployeeForComparable e5=new EmployeeForComparable(2, "zoo");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		Collections.sort(list);
		for (EmployeeForComparable employeeForComparable : list) {
			
			System.out.println(employeeForComparable.getName());
		}

	}
	

}
