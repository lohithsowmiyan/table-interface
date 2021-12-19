package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


 interface SalesMonitoring{
    void createTable(ArrayList<Object> tbl) ;
     void report();
 }
interface TotalSales extends SalesMonitoring{
     void previousMonthSales();
     void currentSales();
}
interface NewProduct extends SalesMonitoring{

 String inferResult();
 int calcRevenue();
 int calcProduct();
}
interface Employeelayoff extends SalesMonitoring{
    Date setDate();
}
