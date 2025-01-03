package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		Integer[] arr = { 12, 13, 22, 9, 7 };

//		For Each Implementation Part One: -
		/*
		 * Arrays.asList(arr).stream().forEach(currEle -> { if (currEle % 2 == 0) {
		 * System.out.println("Even Number"); } else { System.out.println("Odd Number");
		 * }
		 * 
		 * System.out.println("Checking Out..."); });
		 */

//		If the number is even put inside List called result :-

		List<Integer> result = new ArrayList<>();

		Arrays.asList(arr).stream().forEach(currEle -> {
			if (currEle % 2 == 0) {
				result.add(currEle);
			}
		});

		System.out.println(result);

	}

}
