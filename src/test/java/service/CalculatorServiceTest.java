package service;


import junit.framework.Assert;
import org.junit.Test;

public class CalculatorServiceTest {

    @Test
    public void addTwoNumbersTest(){
        int result=CalculatorService.addTwoNumbers(10,20);
        //int expected=50;
        int expected=30;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void  addAnyNumbersTest(){
        int result=CalculatorService.addAnyNumbers(10,20,50,70);
        int expected=150;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void divideTwoNumbersTest(){
        int result=CalculatorService.divideTwoNumbers(10,5);
        int expected=2;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void multiplyTwoNumbersTest(){
        int result=CalculatorService.multiplyTwoNumbers(20,4);
        int expected=80;
        Assert.assertEquals(expected,result);
    }
}
