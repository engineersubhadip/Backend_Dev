package JavaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 6);

		Optional<Integer> res = list.stream().filter(currEle -> currEle % 2 == 0).findFirst();

		if (res.isPresent()) {
			System.out.println(res.get());
		}
	}

}
