//2071. 평균값 구하기
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num2071 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList<>();
		
	
		int test = scanner.nextInt();
	
		
		for(int i=0; i<test; i++) {
			int avg,sum =0;
		
			
			for(int j=0; j<10; j++) { // test 3
				int num = scanner.nextInt();
				sum += num;
				
			}//10j loof
			
			avg = (int) Math.round(sum/ 10.0);
			list.add(avg);
		}//i loof
		
		for(int z=0; z<list.size(); z++ ) {
			System.out.println("#"+(z+1)+" "+ list.get(z)); //#1 24
		}
	}

}
