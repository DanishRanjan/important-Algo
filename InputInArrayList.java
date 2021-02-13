import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputInArrayList {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> array = new ArrayList<>();
	while (sc.hasNextInt()) {
		int i = sc.nextInt();
		array.add(i);
	}
	ArrayList<Integer> sequence = new ArrayList<>();
	while (sc.hasNextInt()) {
		int i = sc.nextInt();
		sequence.add(i);
	}
	//System.out.println(isValidSubsequence(array, sequence));
	
//	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
}
}