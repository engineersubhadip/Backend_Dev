package Exercise_OOPS_Lecture_2;
import java.util.Stack;

public class Client_Ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        
        display(st);
	}
	
	static void display(Stack<Integer> userStack)
	{
		while (userStack.empty() == false)
		{
			int currEle = userStack.pop();
			System.out.println(currEle);
		}
	}
}
