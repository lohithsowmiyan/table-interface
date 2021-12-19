package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
     SalesTable table = new SalesTable(1,50,50,500);
        ArrayList<Object> li = new ArrayList<Object>();
        ArrayList<SalesTable> nli= new ArrayList<SalesTable>();
        li.add(table);
        nli.add(table);
        SalesTable table1 = new SalesTable(2,50,75,500);
        li.add(table1);
        nli.add(table1);
        SalesTable line1 = new SalesTable(3,50,80,40);
        li.add(line1);
        nli.add(line1);
        line1.createTable(li);
        for(int i=0;i<nli.size();i++){
            SalesTable tb = new SalesTable();
            tb=nli.get(i);
            tb.report();
        }
        ArrayList<Object> table2 = new ArrayList<Object>();
        UnitsTable line4 = new UnitsTable(142,"mobile","black",6700,100);
        table2.add(line4);
        UnitsTable line5 = new UnitsTable(185,"mobile","white",7700,118);
        table2.add(line5);
        ArrayList<UnitsTable> ntable2 = new ArrayList<UnitsTable>();
        ntable2.add(line4);
        ntable2.add(line5);
        UnitsTable line6= new UnitsTable(133,"watch","gold",2500,789);
        table2.add(line6);
        ntable2.add(line6);
        line4.createTable(table2);
        for(int i=0;i<ntable2.size();i++) {
            UnitsTable tb = new UnitsTable();
            tb = ntable2.get(i);
            tb.report();
        }
        ArrayList<Object> table3 = new ArrayList<Object>();
        layoffTable line8 = new layoffTable("f83d","sidharth","not meeting weekly target");
        table3.add(line8);
        layoffTable line9 = new layoffTable("d384","kishore","not following the timelines");
        table3.add(line9);
        line9.createTable(table3);
        ArrayList<layoffTable> ntable3 = new ArrayList<layoffTable>();
        ntable3.add(line8);
        ntable3.add(line9);
        for(int i=0;i<ntable3.size();i++) {
            layoffTable tb = new layoffTable();
            tb = ntable3.get(i);
            tb.report();
        }
    }
}
