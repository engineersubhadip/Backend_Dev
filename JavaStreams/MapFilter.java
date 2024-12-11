package JavaStreams;

import java.util.Arrays;

public class MapFilter {

	public static void main(String[] args) {
		Integer[] arr = { 12, 13, 22, 9, 7 };

//		For Each Implementation : -

		Arrays.asList(arr).stream().forEach(currEle -> {
			if (currEle % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		});
	}

}
