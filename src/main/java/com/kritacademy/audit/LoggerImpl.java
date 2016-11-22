package com.kritacademy.audit;

/**
 * LoggerImpl - implementation of logger
 * This class will log a message to file and print to console
 * Created by Chertpong on 11/22/2016.
 */
public class LoggerImpl implements Logger{
    public String debug(String msg) {
        System.out.println("DEBUG: " + msg);
        //suppose that we save msg to file here
        return msg;
    }
}
