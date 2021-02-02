package com.stars.chain;

public class EndFilter extends AbstractFilter {
    public EndFilter(String filterName) {
        super(filterName);
    }

    @Override
    public void handle(Coffee coffee) {
        System.out.println("end: not match ");
    }
}
