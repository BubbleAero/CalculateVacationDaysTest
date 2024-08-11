package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {

        CalculateVacationDays service = new CalculateVacationDays();
        int monthOfRest = service.calculate(10_000, 3000, 20_000);
        System.out.println("Сколько месяцев можно отдохнуть: " + monthOfRest);
    }
}