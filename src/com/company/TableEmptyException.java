package com.company;

public class TableEmptyException extends Exception {
    String empty;
    public TableEmptyException(String empty){
        this.empty=empty;
    }
    public String toString(){
        return empty;
    }
}
