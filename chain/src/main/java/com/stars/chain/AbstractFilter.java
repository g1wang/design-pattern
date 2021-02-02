package com.stars.chain;

public abstract class AbstractFilter {



    protected String filterName;
    protected AbstractFilter nextFilter;

    public AbstractFilter(String filterName) {
        this.filterName = filterName;
    }

    public void setNextFilter(AbstractFilter nextFilter) {
        this.nextFilter = nextFilter;
    }
    public abstract void handle(Coffee coffee);


}


