package com.company;

import java.util.*;

abstract class Cost implements NewProduct {
     public   int price;
     int fixedcost;
     int variablecost;
     int totalcost;
     int qty;
    public Cost()
    {

    }
    public int calcProduct(){
        return fixedcost+variablecost;
    }
}
abstract public class Revenue extends Cost{
    int totalRevenue;
    String result;

    public Revenue(){
        this.totalRevenue=0;
        this.result=null;
    }

    public int calcRevenue(){

        return price*qty ;
    }
    public String inferResult(){
        if(totalcost>totalRevenue)
            return "Loss  ";
        else if(totalRevenue>totalcost)
            return "Profit";
        else
            return "bep   ";
    }

}
 class SalesTable extends Revenue{

        public SalesTable(int qty,int fixedcost,int variablecost,int price)
        {
            this.qty=qty;
            this.price=price;
            this.fixedcost=fixedcost;
            this.variablecost=variablecost;
            this.price=price;
            this.totalcost=calcProduct();
            totalRevenue=calcRevenue();
            result=inferResult();
        }
     public  int getPrice(){
         return price;
     }
     public SalesTable() {

     }
     public String getResult(){
            return result;
     }
     public int getRevenue(){
            return totalRevenue;
     }
     public int getCost(){
            return totalcost;
     }
     public int getQuantity(){
            return qty;
     }
     public String toString(){

            return "|  "+qty+"  |     "+fixedcost+"     |    "+variablecost+"    |    "+totalcost+"   |   "+totalRevenue+"   |  "+result+"     |";
        }
        public  void createTable(ArrayList<Object> tbl){
            Iterator<Object> itr =tbl.iterator();
            try {
                if(!itr.hasNext())
                    throw new TableEmptyException("Table is Empty");
                System.out.println("_________________________________________________________________");
                System.out.println("| QTY | FIXED COST | VAR COST | TOT COST | TOT REV | PROFIT/LOSS |");
                System.out.println("|________________________________________________________________|");
                while (itr.hasNext()) {
                    System.out.println(itr.next());
                    System.out.println("|________________________________________________________________|");

                }
            }
            catch (TableEmptyException e)
            {
                System.out.println(e);
            }
        }

     public void report(){
            System.out.println("The Analysis:");
                 System.out.println("For the price Rs:"+getPrice()+":");
                 if(getResult().equals("Loss")){
                     System.out.println("The Revenue u get From the quantity"+getQuantity()+"results in a loss of average:"+(getCost()-getRevenue()));
                 }
                 else{
                     System.out.println("The Revenue u get From the quantity"+getQuantity()+"results in a profit of average:"+(getRevenue()-getCost()));
                 }
             }

}
