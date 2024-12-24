package com.madhavTech.model;


import java.io.Serializable;

public class SystemMessage implements Serializable {

    private static final long serializeVersionUID = 1L;

    private String source;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "SystemMessage{" +
                "source='" + source + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
