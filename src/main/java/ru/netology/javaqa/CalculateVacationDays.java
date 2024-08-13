package ru.netology.javaqa;

public class CalculateVacationDays {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // сколько денег
        int monthOfRest = 0; // сколько месяцев отдыха
        for (int month = 1; month < 12; month++) {
            if (money >= threshold) { // можем отдыхать
                money = (money - expenses)/3; // что осталось после расходов
                monthOfRest++;
            } else {
                money = money + income - expenses;
            }
        }
        return monthOfRest;
    }
}
