package streammethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class User {
	int id;
	String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
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
		User other = (User) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	public static void main(String[] args) {
		 List<User> list=new ArrayList<User>();
		 User u1=new User(5, "vinni");
		 User u2=new User(2, "ani");
		 User u3=new User(1, "bheem");
		 User u4=new User(0, "kavana");
		 list.add(u1);
		 list.add(u2);
		 list.add(u3);
		 list.add(u4);
		 
		 Collections.sort(list, new UserIdCompare());
		 for (User user : list) {
			System.out.println(user);
		}
		 System.out.println("===========");
		 Collections.sort(list, new UserNameComparator());
		 for (User user : list) {
			System.out.println(user);
		}
	}

}
