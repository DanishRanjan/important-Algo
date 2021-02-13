import java.util.*;

public class validSubsequnces {

	public static void main(String[] args) {
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
		System.out.println(isValidSubsequence(array, sequence));

	}

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int arrIndex = 0;
		int ssIndex = 0;
		while (ssIndex < sequence.size() && arrIndex < array.size()) {
			if (sequence.get(ssIndex) == (array.get(arrIndex))) {
				ssIndex++;
			}
			arrIndex++;
		}
		if (ssIndex == sequence.size()) {
			return true;
		} else {
			return false;
		}
	}

}
