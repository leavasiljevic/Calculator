package com.example.calc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

//    private final CalcServiceHistory calcServiceHistory;
//    public CalcController(CalcServiceHistory calcServiceHistory) {
//        this.calcServiceHistory = calcServiceHistory;
//    }

//    @GetMapping("/testG")
//    public CalcResponse testG(){
//        return new CalcResponse(calcService.testConsola());
//    }
//
//    @PostMapping("/testP")
//    public CalcResponse testP(@RequestBody CalcRequest calcRequest){
//        return new CalcResponse("Hi iz POST" + calcRequest.getMessage());
//    }

    @PostMapping("/add")
    public CalcResponseInt add(@RequestBody CalcRequest calcRequest){
        return new CalcResponseInt(calcService.add(calcRequest.getA(), calcRequest.getB()));
    }

    @PostMapping("/sub")
    public CalcResponseInt sub(@RequestBody CalcRequest calcRequest){
        return new CalcResponseInt(calcService.sub(calcRequest.getA(), calcRequest.getB()));
    }

    @PostMapping("/mul")
    public CalcResponseInt mul(@RequestBody CalcRequest calcRequest){
        return new CalcResponseInt(calcService.mul(calcRequest.getA(), calcRequest.getB()));
    }

    @PostMapping("/div")
    public CalcResponse div(@RequestBody CalcRequest calcRequest){
        return new CalcResponse(calcService.div(calcRequest.getA(), calcRequest.getB()));
    }

   @GetMapping("/history")
    public List<CalcOp> history(){
        return calcService.History();
    }

}
