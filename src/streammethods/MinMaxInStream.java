package streammethods;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxInStream {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
//		LapPrice l1=new LapPrice(8);
//		LapPrice l2=new LapPrice(4);
//		LapPrice l3=new LapPrice(1);
//		LapPrice l4=new LapPrice(3);
//		LapPrice l5=new LapPrice(0);
		al.add(11);
		al.add(10);
		al.add(8);
		al.add(6);
		al.add(9);
		al.add(1);
		
		Integer h=al.stream().min((l1,l2)->l1.compareTo(l2)).get();//forEach(System.out::println);
		System.out.println(h);

	}

}
