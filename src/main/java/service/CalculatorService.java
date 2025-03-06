package service;

public class CalculatorService {
    public static int addTwoNumbers(int a,int b){
        return a+b;
    }

    public static int multiplyTwoNumbers(int a,int b){
        return a*b;
    }

    public static int divideTwoNumbers(int a,int b){
        return a/b;
    }

    public static int addAnyNumbers(int ...a){
        int s=0;
        for(int e:a){
            s+=e;
        }
        return s;
    }
}
