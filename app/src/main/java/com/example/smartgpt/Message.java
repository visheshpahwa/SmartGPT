package com.example.smartgpt;

public class Message {

    public static String SENT_BY_ME ="me";
    public static String SENT_BY_BOT ="bot";

    String message;

    public String getMessage() {
        return message;
    }

    public Message(String message, String sentBy) {
        this.message = message;
        this.sentBy = sentBy;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    String sentBy;
}
