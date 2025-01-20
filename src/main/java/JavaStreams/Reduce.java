package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(12,13,44,22,10);
		
		Integer ans = arr.stream().reduce(0, (prev,curr) -> {return prev+curr;});
		
		System.out.println(ans);
	}

}
