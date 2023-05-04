package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import testjava.BaseTest;

public class SuiteListeners implements ITestListener, IAnnotationTransformer {
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test success");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failiiing");
	//	String fileName = "src/screenshot" + result.getMethod().getMethodName();
		File f = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(f, new File("screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(utils.RetryAnalyser.class);
		
	}

}
