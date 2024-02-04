package supplier;

import java.util.Date;
import java.util.function.Supplier;

public class DateExample {
	public static void main(String[] args) {
		
		Supplier<Date> cd=()->new Date();
		System.out.println(cd.get());
	}

}
