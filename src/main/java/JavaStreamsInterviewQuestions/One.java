package JavaStreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class One {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(12,13,14,8,8,18,2,3,5);
		
		List<Integer> evenList = arr.stream().filter(currEle -> {
			if (currEle  % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).collect(Collectors.toList());
		
		List<Integer> oddList = arr.stream().filter(currEle -> currEle % 2 == 1).collect(Collectors.toList());
		
		System.out.println("Even List "+evenList);
		System.out.println("Odd List "+oddList);
	}

}
