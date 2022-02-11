package com.shankar.lesson2;

public class TestSaleInfo {
    public static void main(String[] args) {
        SaleInfo s = new SaleInfo();
        s.inputDailySales("Sunday", 500);
        s.inputDailySales("Monday", 400);
        s.inputDailySales("Tuesday", 600);
        s.inputDailySales("Wednesday", 700);
        s.inputDailySales("Thursday", 400);
        s.inputDailySales("Friday", 750);
        s.inputDailySales("Saturday", 550);

        System.out.println(s.toString());
        System.out.println("Max Sales Day: " + s.highestSalesDay());

    }
}
