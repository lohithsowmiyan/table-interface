package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

abstract class SalesDetails implements TotalSales {
     int code;

     String Name;
     String Color;
     String price;
     int units;
     String total;

     public SalesDetails(){

     }
     public String moneyFormat(int num){
         NumberFormat currency = NumberFormat.getCurrencyInstance();
         String str=currency.format(num);
         return str;
     }
}
class UnitsTable extends SalesDetails{
     public UnitsTable(int code,String Name, String Color, int price, int units){
         this.code=code;
         this.Color=Color;
         this.Name=Name;
         this.price=moneyFormat(price);
         this.units=units;
         total=moneyFormat(price*units);
     }

    public UnitsTable() {
    }

    public String toString(){
         return "| "+code+" | "+Color+" | "+Name+" | "+price+" | "+units+" | "+total+" | ";
     }
     public int getUnits(){
         return units;
     }
     public int getCode(){
         return code;
     }
     public String getTotal(){
         return total;
     }

    public void createTable(ArrayList<Object> tbl) {
        Iterator<Object> itr=tbl.iterator();
        try {
            if(!itr.hasNext())
                throw new TableEmptyException("Table is empty");
            System.out.println("________________________________________________________");
            System.out.println("| CODE | VARIANT | NAME |  COST | TOT UNITS | TOT COST |");
            System.out.println("|______________________________________________________|");
            while (itr.hasNext()) {
                System.out.println(itr.next());
                System.out.println("|______________________________________________________|");
            }
        }
        catch (TableEmptyException e){
            System.out.println(e);
        }

    }

    public void report() {
        System.out.println("The Analysis:");
        System.out.println("The item with code"+getCode()+"has shipped over"+getUnits()+"units with a total sales of Rs"+getTotal());
    }


    public void previousMonthSales() {

    }

    public void currentSales(){

    }

}
