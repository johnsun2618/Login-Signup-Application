package com.example.GreenStitch_Assignment.Response;

public class LoginResponse {
    
    String message;
     
    String status;

    public LoginResponse() {
    }
    
    public LoginResponse(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public LoginResponse(String loginSuccessfull, boolean b) {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
    
}
