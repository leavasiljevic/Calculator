package com.example.calc2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        history.add(new CalcOp(a, b,"sub", result));
        System.out.println("Razlika je: " + result);
        return (int)result;
    }
    public int mul(int a, int b){
        result = a * b;
        history.add(new CalcOp(a, b, "mul", result));
        System.out.println("Proizvod je: " + result);
        return (int)result;
    }
//    public ResponseEntity<Object> div(double a, double b){
//        if (b != 0.0){
//            result = a / b;
//            history.add(new CalcOp(a, b, "div", result));
//            System.out.println("Kolicnik je: " + result);
//            return new ResponseEntity<>(result,HttpStatus.OK);
//            //return result;
//        }else{
//            result = 0;
//            history.add(new CalcOp(a, b, "div", result));
//            System.out.println("Delenje sa 0 nije podrzano");
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }

    public ResponseEntity div(int a, int b){
        if (b != 0.0){
            result = a / b;
            history.add(new CalcOp(a, b, "div", result));
            System.out.println("Kolicnik je: " + result);
            return new ResponseEntity<>(new CalcResponse(result),HttpStatus.OK);
            //return result;
        }else{
            result = 0;
            history.add(new CalcOp(a, b, "div", result));
            System.out.println("Delenje sa 0 nije podrzano");
            return new ResponseEntity<>("Gresska", HttpStatus.BAD_REQUEST);
        }
    }

    public List<CalcOp> History() {
        System.out.println("Dodato u history");
        return history;
    }

    public List<CalcOp> deleteHistory() {
        System.out.println("Izbrisan history");
        return history = new ArrayList<>();
    }
}
