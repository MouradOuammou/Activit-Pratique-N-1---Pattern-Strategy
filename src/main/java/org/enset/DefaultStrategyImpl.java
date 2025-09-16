package org.enset;

public class DefaultStrategyImpl implements  Strategy {
    @Override
    public void Operation() {
        System.out.println("Implémentation de la stratégie default");
    }
}
