package service;


import junit.framework.Assert;
import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init(){
        System.out.println("Before test cases: " +new Date());
    }

    @Before
    public  void beforeEach(){
        System.out.println("BeforeEach TestCase");
    }

    @After
    public void afterEach(){
        System.out.println("AfterEach Testcase");
    }

    @Test(timeout = 2000)
    public void addTwoNumbersTest() throws InterruptedException {
        //Thread.sleep(3000);
        System.out.println("Inside Add two numbers:");
        int result=CalculatorService.addTwoNumbers(10,20);
        //int expected=50;
        int expected=30;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void  addAnyNumbersTest(){
        System.out.println("Inside Add Any numbers:");
        int result=CalculatorService.addAnyNumbers(10,20,50,70);
        int expected=150;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void divideTwoNumbersTest(){
        System.out.println("Inside Divide two numbers:");
        int result=CalculatorService.divideTwoNumbers(10,5);
        int expected=2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void multiplyTwoNumbersTest(){
        System.out.println("Inside Multiply two numbers:");
        int result=CalculatorService.multiplyTwoNumbers(20,4);
        int expected=80;
        Assert.assertEquals(expected,result);
    }

    @AfterClass
    public static void after(){
        System.out.println("After all testCases: "+new Date());
    }
}
