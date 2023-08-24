package com.pfm.demo.Utils;

import lombok.Data;

@Data
public class Response {
    private String message;
    private String status;

    public String getResponse(String message,String status){
        this.message = message;
        this.status = status;
        return message+" : "+status;
    }
}
