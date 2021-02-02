package com.stars.chain;

public class BlueFilter extends AbstractFilter {


    public BlueFilter(String filterName) {
        super(filterName);
    }

    @Override
    public void handle(Coffee coffee) {
        if (COLOR.BLUE.equals(coffee.getColor())) {
            System.out.println("blue handler: " + coffee.getColor());
        } else if (this.nextFilter != null) {
            this.nextFilter.handle(coffee);
        }
    }
}
