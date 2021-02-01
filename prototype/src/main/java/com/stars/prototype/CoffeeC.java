package com.stars.prototype;

public class CoffeeC implements Cloneable{

    private String type;
    private String size;

    public CoffeeC(String type, String size) {
        this.type = type;
        this.size = size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
