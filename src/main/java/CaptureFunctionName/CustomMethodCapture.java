package CaptureFunctionName;

public class CustomMethodCapture {

	public static String methodName() {
		String methodName = new Exception().getStackTrace()[1].getMethodName();
		return methodName;
	}
}
