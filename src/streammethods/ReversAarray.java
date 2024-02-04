package streammethods;

import java.util.Scanner;

public class ReversAarray {
	public static void main(String[] args) {
		 
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter  array");

			arr[i]=scanner.nextInt();
		}
		for(int i=size-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}
	}

}
