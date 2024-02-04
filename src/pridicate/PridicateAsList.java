package pridicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PridicateAsList {
	public static void main(String[] args) {
	List< Integer> list=Arrays.asList(8,2,2,9,9,5,6,4,8,8,8,8);
	Predicate<Integer> pre1=x->x>5;
	Predicate<Integer> pre2=x->x%2==0;
	
	List l=list.stream().filter(pre1.and(pre2)).collect(Collectors.toList());
	//list.stream().filter(pre1).collect(Collectors.toList()).forEach(System.out::println);
	//list.stream().filter(pre2).collect(Collectors.toList()).forEach(System.out::println);
	System.out.println(l);
	for(int i=0;i<l.size()-1;i++) {
		for(int j=i+1;j<l.size()-1;j++) {
			if(l.get(i)==l.get(j)) {
				System.out.println(l.get(i));
				
			}
		}
	}
		

	}

}
