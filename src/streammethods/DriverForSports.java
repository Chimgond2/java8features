package streammethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class DriverForSports {
	
	public static void main(String[] args) {
		
		Sports sports1=new Sports(1, "Vollyball");
		Sports sports2=new Sports(2, "football");
		Sports sports3=new Sports(3, "cricket");
		Sports sports4=new Sports(4, "football");
		Sports sports5=new Sports(1, "througthball");
		Sports sports6=new Sports(6, "Vollyball");
		
		
		List<Sports> list=new ArrayList<Sports>();
		list.add(sports1);
		list.add(sports2);
		list.add(sports3);
		list.add(sports4);
		list.add(sports5);
		list.add(sports6);
		
		for(Sports e:list) {
			for(int i=1;i<list.size()-1;i++) {
				
				//if(e.sName.equalsIgnoreCase())
			}
		}
		
		Map<String,Set<Sports>> groupOfSports=list.stream().collect(Collectors.groupingBy(e->e.getsName(),Collectors.toSet()));
		System.out.println(groupOfSports);
		
//		for(Map.Entry<String, Set<Sports>> traverse:groupOfSports.entrySet()) {
//			System.out.println(traverse.getValue());
//		}
		
		
//		List<Sports> list2=new ArrayList<Sports>();
//		for (Sports sports : list) {
//			if(sports.getsName().compareTo(list2.ge)) {
//				System.out.println("ko");
//			}else {
//				list2.add(sports);
//				//System.out.println(sports.sName);
//			}
//		}
//		System.out.println(list2);
		
     Map<String, Integer> map4=new TreeMap<String, Integer>();
     
     //map4.put(null, groupOfSports.get());
		
	}

}
