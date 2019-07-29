package com.example.demo.exception;
/*
* Created by Yogesh Sharma on 22/06/2019.
* */

public class DataNotSavedException extends Exception {

    public DataNotSavedException(String s, Exception e) {
        super(s, e);
    }

    public DataNotSavedException(Exception e) {
        super(e);
    }

}
