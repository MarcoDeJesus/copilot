package com.marco.automation.utils.listeners;

import org.testng.TestListenerAdapter;
import org.testng.ITestResult;


public class TestReport extends TestListenerAdapter{
    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        System.out.println("Test Failed");
    }
    
    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        System.out.println("Test Skipped");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        System.out.println("Test Success");
        //throw new RuntimeException("Test Success");
    }
}
