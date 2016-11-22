package com.kritacademy.audit;

/**
 * LoggerInMemory - Implementation of Logger
 * this will log message and then print (no saving)
 * Created by Chertpong on 11/22/2016.
 */
public class LoggerInMemory implements Logger {
    public String debug(String msg) {
        System.out.println("[DEBUG]:" +msg);
        return msg;
    }
}
