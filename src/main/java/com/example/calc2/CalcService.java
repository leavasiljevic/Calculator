package com.example.calc2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalcService {

//    public String testConsola(){
//        System.out.println("Ispis da je proslo");
//        return "test Consola";
//    }

    private double result;
    private List<CalcOp> history = new ArrayList<>();
    //private double resultD;

    public int add(double a, double b){
        result = a + b;
        history.add(new CalcOp(a, b, "add", result));
        System.out.println("Zbir je: " + (int)result);
        return (int)result;
    }

    public int sub(int a, int b){
        result = a - b;
        System.out.println("Razlika je: " + result);
        return (int)result;
    }
    public int mul(int a, int b){
        result = a * b;
        System.out.println("Proizvod je: " + result);
        return (int)result;
    }
    public double div(double a, double b){
        result = a / b;
        System.out.println("Kolicnik je: " + result);
        return result;
    }

    public List<CalcOp> History() {
        return history;
    }
}
