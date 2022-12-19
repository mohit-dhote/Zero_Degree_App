package com.dbcts.textskap;

public class IndividualMessage {

    private String userName;
    private String Message;


    public IndividualMessage(String userName, String message) {
        this.userName = userName;
        Message = message;
    }

    public IndividualMessage() {
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return Message;
    }
}
