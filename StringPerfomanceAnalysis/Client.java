package StringPerfomanceAnalysis;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringPerformace(1000000);
		StringBuilderPerformance(1000000);
	}
	
//	10 : 8
//	100 : 10
//	1000 : 13
//	10000 : 64
//	100000 : 2106
//	1000000 : Did not received 
	static void StringPerformace(int N)
	{
		long startingTime = System.currentTimeMillis();
		
		String s1 = "";
		
		for (int i=1; i<=N; i++)
		{
			s1 += i;
		}
		
		long endingTime = System.currentTimeMillis();
		
		System.out.println("Time Taken : "+(endingTime - startingTime));
		
//		System.out.println(s1);
	}
	
//	10 : 0
//	100 : 0
//	1000 : 1
//	10000 : 2
//	100000 : 6
//	1000000 : 28
	static void StringBuilderPerformance(int N)
	{
		long startTime = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("");
		
		for (int i=1; i<=N; i++)
		{
			sb.append(i);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time taken : "+(endTime - startTime));
//		System.out.println(sb.toString());
	}

}


// It proves String Builders are better at performance than Strings.
// The average ammortized Time Complexity for String Builder is O(1) for
// append and for Strings the Time Complexity is O(N).