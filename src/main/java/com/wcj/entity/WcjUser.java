package com.wcj.entity;

public class WcjUser {
    private String id;
    private String name;
    private String sign;

    public WcjUser(String id, String name, String sign) {
        this.id = id;
        this.name = name;
        this.sign = sign;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }
}
