package function;

import java.util.function.Function;

public class SquerOfNo {
	public static void main(String[] args) {
		Function<Integer, Integer> squer=i->i*i;
		//System.out.println(squer.apply(5));
		
		Function<Integer, Integer> even=i->((i*2));
		//System.out.println(even.apply(5));
		
		Function<Integer, Integer> odd=i->((i/2)*10);

		
		//System.out.println(squer.andThen(even).apply(5));
		//System.out.println(squer.compose(even).apply(5));
		System.out.println(squer.compose(even).compose(odd).apply(2));

	}

}
