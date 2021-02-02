package com.stars.chain;

public class RedFilter extends AbstractFilter{


    public RedFilter(String filterName) {
        super(filterName);
    }

    @Override
    public void handle(Coffee coffee) {
        if (COLOR.RED.equals(coffee.getColor())){
            System.out.println("red handler: "+coffee.getColor());
        }else if (this.nextFilter != null){
            this.nextFilter.handle(coffee);
        }
    }
}
