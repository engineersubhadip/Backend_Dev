package JavaStreams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.stream().filter(currEle -> currEle % 2 == 0).forEach(currEle -> System.out.println(currEle));
	}

}
