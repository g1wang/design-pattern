package com.stars.adapter;

/**
 * 适配milk，统一口径
 */
public class MilkMakerAdapter implements BeverageMaker{

    private MilkCook milkCook;

    public MilkMakerAdapter(MilkCook milkCook) {
        this.milkCook = milkCook;
    }

    @Override
    public void make() {
        milkCook.cook();
    }
}
