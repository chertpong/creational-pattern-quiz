package com.kritacademy.audit;

import java.time.LocalDateTime;

/**
 * Created by Chertpong on 12/3/2016.
 */
public class LoggerDecorator implements Logger {
    private Logger delegate;

    public LoggerDecorator(Logger delegate) {
        this.delegate = delegate;
    }

    public LoggerDecorator() {
        this.delegate = new LoggerImpl();
    }


    public String debug(String msg) {
        String newText = LocalDateTime.now().toString() + msg;
        return this.debug(newText);
    }
}
