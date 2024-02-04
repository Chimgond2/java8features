package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First {
	public static void main(String[] args) {
		
		List<String> city=List.of("kamal","komal","raghav","arun");
		
		List cit=city.stream().filter(r->r.length()>4).collect(Collectors.toList());
		System.out.println(cit);
		
		List<Integer> no=Arrays.asList(20,5,85,90);
		no.stream().map(i->i*i).collect(Collectors.toList()).forEach(System.out::println);;
		
	}

}
