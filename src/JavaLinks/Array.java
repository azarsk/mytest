package JavaLinks;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		int[] modelNumber = { 111, 222, 333, 444 };
		char[] code = { 'A', 'B', 'c', 'D' };
		System.out.println(Arrays.toString(modelNumber));

		for (int i = 0; i < cars.length; i++) {

			System.out.println(cars[i]);
			System.out.println(modelNumber[i]);
			System.out.println(code[i]);
			System.out.println("------------------------");

		}

		int[][] a = { { 10, 20 }, { 30, 40 } };
		System.out.println("Two Dimmensional Array");
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				System.out.println(a[i][j]);
			}

		} */

		int[][] c = { { 10, 20, 30 }, { 40, 50, 60, 70, }, { 80, 100 }, { 110, 120, 130, 140 } };

		/*for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j]);

			}

		}*/
		System.out.println(c.length);
		int i = 0;
		while (i < c.length) {
			int j=0;
			while (j <c[i].length) {
		  System.out.println(c[i][j]);
		  j++;
		}
			i++;
			//System.out.println(i);
			
		}
	}

}
