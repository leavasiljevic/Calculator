package com.example.calc2;

public class CalcOp {
    private String operation;
    private double a;
    private double b;
    private double result;


    public CalcOp(double a, double b, String operation,  double result) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        this.result = result;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setResult(double result){
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getResult() {
        return result;
    }
}
