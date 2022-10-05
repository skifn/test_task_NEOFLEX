package com.test_Neoflex.Calculator.Service;

import com.test_Neoflex.Calculator.Model.Calculator;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service
public class CalculatorService  {

    //История вычислений
    HashMap<Integer, Calculator> calculations = new HashMap<>();

    //Рассчет результата
    public Calculator calculate_res(int index, double average_salary, int number_of_days) {
        //Величина отпускных = средний дневной заработок × количество рабочих дней отпуска
        //average_salary - это за 12 месяцев
        //Необходимо найти средний дневной заработок

        //Средний заработок за день – это величина средств, начисленная
        // и выплаченная за расчетный период, разделенная
        // на количество дней в этом периоде или на фиксированное количество дней.

        //Для вычисления среднего заработка за день будет использована формула
        //СДЗ = С-12 / 12 / 29,3
        //Где СДЗ - средний дневной заработок
        //С-12 - сумма, начисленная за 12 месяцев
        //29,3 - условно принятое среднее фиксированное число дней в месяце

        double averageDailySalary = average_salary/ 12 / 29.3;

        //Умножаем средний дневной заработок на количество дней отпуска
        double result = averageDailySalary * number_of_days;

        //Добавляем результат в наш метод по добавлению истории о вычислениях
        add_calculation(index, average_salary, number_of_days, Math.ceil(result));

        //Получаем результат
        return calculations.get(index);
    }

    //Добавляем вычисление в историю
    public void add_calculation(int index, double average_salary, int number_of_days, double result) {


        calculations.put(index, new Calculator(index, average_salary, number_of_days, result));

    }


    //Поиск вычисления по ID
    public Calculator findCalculationById(int index) {
        return calculations.get(index);
    }






}