package com.test_Neoflex.Calculator.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calculation {

    //ID вычисления
    private int calculationId;

    //Средняя зар. плата за 12 дней
    private double average_salary;
    //Количество дней отпуска
    private int numberOfDays;
    //Результат
    private double result;

}