package com.kritacademy.audit;

/**
 * LoggerFactory - return a singleton Logger
 * by default will return Logger of LoggerImpl.class
 * Created by Chertpong on 11/22/2016.
 */
public class LoggerFactory {
    private static Logger logger;
    public static Logger getLogger(){
        if(logger == null) {
            logger = new LoggerImpl();
            return logger;
        }
        else {
            return logger;
        }
    }
}
