package com.test_Neoflex.Calculator.Service;

import com.test_Neoflex.Calculator.Model.Calculation;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class CalculatorService  {

    //История вычислений
    HashMap<Integer, Calculation> calculations = new HashMap<>();

    //Рассчет результата
    public Calculation calculate_res(int index, double average_salary, int number_of_days) {

        double averageDailySalary = average_salary/ 12 / 29.3; //СДЗ
        double result = averageDailySalary * number_of_days; //Отпускные

        add_calculation(index, average_salary, number_of_days, Math.ceil(result));

        return calculations.get(index);
    }

    //Добавляем вычисление в историю
    public void add_calculation(int index, double average_salary, int number_of_days, double result) {

        calculations.put(index, new Calculation(index, average_salary, number_of_days, result));

    }


    //Поиск вычисления по ID
    public Calculation findCalculationById(int index) {

        return calculations.get(index);
    }






}