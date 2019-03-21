package edu.xavier.csci.inclass.inclassservice;

public class Response {

    private String type;
    private Integer code;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String toString() {
        return type + "/"+code;
    }
}
