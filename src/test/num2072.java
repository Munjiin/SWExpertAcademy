//2072. 홀수만 더하기
package test;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class num2072{
	
	public static void main(String[] args) {
	
		

		
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		List list = new ArrayList();
		
	
		
		for(int i=0; i<test; i++) {
			int sum=0;
			
			for(int num=0; num<10; num++) {
				int input = scanner.nextInt();
				
				if(input%2 != 0) {
					sum += input;
					
				}
				
			}
			list.add(sum);
			
			
		}
		
		
		
		for(int i=0; i < list.size(); i++) {
			System.out.println("#"+ (i+1) +" " + list.get(i));
		}
	
		
		
		
	}//main

}
