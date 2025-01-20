package JavaStreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two_Distinct {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(12,13,2,4,2,13,22,13);
		
		List<Integer> result = arr.stream().distinct().collect(Collectors.toList());
		
		System.out.println(result);
	}

}
