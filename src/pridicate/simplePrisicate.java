package pridicate;

import java.util.function.Predicate;

public class simplePrisicate {
	public static void main(String[] args) {
		//int k=20;
		Predicate<Integer> p=a->a%2==0;
		System.out.println(p.test(51));
		
		
	}

}
