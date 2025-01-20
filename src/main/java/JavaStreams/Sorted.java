package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(12,13,8,7,3,12,11,10));
		
		List<Integer> result =  arr.stream().sorted(new Comparator<Integer>() {
			public int compare (Integer a, Integer b) {
				return b.compareTo(a);
			}
		}).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
