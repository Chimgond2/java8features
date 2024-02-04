package streammethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	int id;
	String name;
	String department;
	
	
	public Student(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	


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



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + "]";
	}



	public static void main(String[] args) {
		
		//double one=Math.random();
		double two=Math.random();
		
		//System.out.println(one );
		System.out.println(two);


		List<Student> sor=new ArrayList();
		Student s1=new Student(5, "chetan","cs");
		Student s2=new Student(1, "anand","mech");
		Student s8=new Student(9, "loffer","mech");

		Student s3=new Student(1, "khaja","cs");

		Student s4=new Student(4, "zoo","civil");
		Student s7=new Student(4, "po","fgh");

		sor.add(s7);
		sor.add(s1);
		sor.add(s2);
		sor.add(s3);
		sor.add(s4);
		sor.add(s8);

	//	sor.stream().sorted((a,b)->a.getName().compareToIgnoreCase(b.getName())).forEach(System.out::println);
		
//	  sor.stream().sorted((i1,i2)->{
//			Integer a1=(Integer)i1;
//			Integer a2=(Integer)i2;
//			return a2-a1;
//		}).forEach(System.out::println);
		
		//sor.stream().sorted((i1,i2)->i1.compareTo(i2)).forEach(e->System.out.println(e));;
//	
		Map<Integer, List<Student>> map1=sor.stream().collect(Collectors.groupingBy(stu->stu.getId()));
			//System.out.println(map1+"==");
		
			Map<Integer, Set<Student>> map2=sor.stream().collect(Collectors.groupingBy(stu->stu.getId(),TreeMap::new,Collectors.toSet()));
			
			
			System.out.println(map2+"==");	
			Stream h=sor.stream();
	
	}



	@Override
	public int hashCode() {
		return Objects.hash(department);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(department, other.department);
	}

}
