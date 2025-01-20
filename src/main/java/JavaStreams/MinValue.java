package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class MinValue {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(12,13,2,1,-2,2,33);
		
		Integer ans =  arr
				.stream()
				.reduce(Integer.MAX_VALUE, (prev, curr) -> {return Math.min(prev, curr);});
		
		System.out.println(ans);
}
}
