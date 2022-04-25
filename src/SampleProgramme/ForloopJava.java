package SampleProgramme;

import java.util.ArrayList;

public class ForloopJava {

	public static void main(String[] args) {
		/*int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int b[]= {5,6,7,8,9,10};
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		for(int k:b) {
			System.out.println("--------------");
			System.out;.println(k);
		}
		for (int i = 0; i <a.length; i++) {
           System.out.println(a[i]);
		}*/
		//multiarray
		//int arr[][]=new int[3][3];
		/*int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		  
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]);
				
			}*/
		int n=5;
		
		ArrayList<Integer> list= new ArrayList<Integer>(n);
		
		for(int i=0;i<5;i++) {
			list.add(i);	
		}
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(2,2);
		System.out.println(list);
		


	}
}
