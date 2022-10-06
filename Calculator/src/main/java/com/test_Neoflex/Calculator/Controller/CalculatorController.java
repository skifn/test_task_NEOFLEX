package com.test_Neoflex.Calculator.Controller;


import com.test_Neoflex.Calculator.Model.Calculation;
import com.test_Neoflex.Calculator.Service.CalculatorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CalculatorController  {


    private CalculatorService calculatorService;


    //Рассчет отпускных
    @GetMapping("/calculate/{id}/{avg_sal}/{numbOfDays}")
    public Calculation calculate_res(@PathVariable("id") int id, @PathVariable("avg_sal") double avg_sal, @PathVariable("numbOfDays") int numbOfDays) {


        return calculatorService.calculate_res(id, avg_sal, numbOfDays);


    }

    //Получение истории вычислений по ID
    @GetMapping("/{id}")
    public Calculation getHistory(@PathVariable("id") int id) {


        return calculatorService.findCalculationById(id);

    }









}
