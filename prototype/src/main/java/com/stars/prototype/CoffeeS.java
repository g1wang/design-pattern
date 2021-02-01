package com.stars.prototype;

import java.io.Serializable;

public class CoffeeS implements Serializable {

    private String type;
    private String size;

    public CoffeeS(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
