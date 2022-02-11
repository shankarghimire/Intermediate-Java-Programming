package com.shankar.lesson2;

public class SaleInfo {
    private String[] days;
    private double[] amount;
    private int index;

    public SaleInfo(){
        days = new String[7];
        amount = new double[7];
        index = 0;
    }
    public void inputDailySales(String day, double salesAmount){
        days[index] = day;
        amount[index] = salesAmount;
        index++;
    }

    public String toString(){
        String salesInfo = "Days\tSales Amount\n";
        for(int i = 0; i< 7; i++){
            salesInfo += days[i] + "\t" + amount[i] + "\n";
        }
        return salesInfo;
    }
    public String highestSalesDay(){
        String maxSaleDay = "";
        double maxSale = Double.MIN_VALUE;
        for(int i = 0; i < 7; i++){
            if(amount[i] > maxSale){
                maxSale = amount[i];
                maxSaleDay = days[i];
            }
        }
        return maxSaleDay;
    }
}
