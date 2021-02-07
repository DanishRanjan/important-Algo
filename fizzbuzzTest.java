import java.util.*;

public class fizzbuzzTest {
	public static void main(String args[]) {

//	for(int i=1;i<=100;i++) {
//		System.out.println(i);
//	}

//-----------------------------Normal-------------------Normal----------------Normal----------------Normal--------------------
//		for (int i = 1; i <= 100; i++) {
//
//			if (i % 15 == 0) {
//				System.out.println("fizzbuzz");
//			} else if (i % 3 == 0) {
//				System.out.println("fizz");
//			} else if (i % 5 == 0) {
//				System.out.println("buzz");
//			} else {
//				System.out.println(i);
//			}
//		}

//-------------- without checking modulo of 3 and 5 agin for 15---------------------------------------------------------------
//		for (int i = 1; i < 100; i++) {
//			String data = "";
//			if (i % 3 == 0) {
//				data = data + "fizz";
//			}
//			if (i % 5 == 0) {
//				data = data + "buzz";
//			}
//			if (data == "") {
//				System.out.println(i);
//			} else {
//				System.out.println(data);
//			}
//		}

//---------------------------without using modulo signature-----cause modulo has more time complexity-------------------------		
		int count3 = 0;
		int count5 = 0;

		for (int i = 1; i < 100; i++) {
			count3++;
			count5++;
			String data = "";
			if (count3 == 3) {
				data = data + "fizz";
				count3 = 0;
			}
			if (count5 == 5) {
				data = data + "buzz";
				count5 = 0;
			}
			if (data == "") {
				System.out.println(i);
			} else {
				System.out.println(data);
			}
		}
	}
}
