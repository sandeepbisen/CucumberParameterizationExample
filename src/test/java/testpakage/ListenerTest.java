package testpakage;


import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerTest extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult tr) {
		log("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		log("Test '" + tr.getMethod() + "' PASSED");
		System.out.println(".....");
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		log("Test '" + tr.getMethod() + "' FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		log("Test '" + tr.getMethod() + "' SKIPPED");
		System.out.println(".....");
	}

	private void log(String methodName) {
		System.out.println(methodName);
	}

	private void log(IClass testClass) {
		System.out.println(testClass);
	}
}