package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import javax.naming.Name;
import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class layoffTable implements Employeelayoff{
    String empid;
    String empname;
    String Reason;
    Date  date;
    public layoffTable(){

    }
    public layoffTable(String empid,String empname,String reason){
        this.empid=empid;
        this.empname=empname;
        this.Reason= reason;
        date=setDate();
    }
    public String getName(){
        return empname;
    }
    public String getReason(){
        return Reason;
    }

    public Date setDate() {
        Date today= new Date();
        today.getTime();
        return today;
    }
    public Date getDate(){
        return date;
    }
    public String toString(){
        return "| "+empid+" | "+empname+" | "+Reason+" | "+date+" |";
    }
    public void createTable(ArrayList<Object> tbl) {
        Iterator<Object> itr = tbl.iterator();
        try {
            if (!itr.hasNext())
                throw new TableEmptyException("table is Empty");
            System.out.println("______________________________________________________________________________");
            System.out.println("| EMP ID  |  EMP NAME   |       REASON            |             DATE          |");
            System.out.println("|_____________________________________________________________________________|");
            while (itr.hasNext()) {
                System.out.println(itr.next());
                System.out.println("|_____________________________________________________________________________|");
            }
        } catch (TableEmptyException e) {
            System.out.println(e);
        }
    }


    public void report() {
        System.out.println("The Employee:"+getName()+" was terminated from all forms of contract with the company due to "+getReason()+" on "+getDate());
    }



}
