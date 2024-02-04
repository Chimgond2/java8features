package consumer;

import java.util.function.Consumer;

public class Squer {
	public static void main(String[] args) {
		Consumer<Integer> squer=i->System.out.println("y"+i*i);
		squer.accept(5);
		
		Consumer<Integer> squerto2=i->System.out.println("s"+i*2);
		
		System.out.println(squer.andThen(squerto2));
		
	}

}
