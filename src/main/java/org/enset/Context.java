package org.enset;

public class Context {
    private Strategy strategy;
    public void effectuerOperation() {
        System.out.println("Opération en cours...");
        strategy.Operation();
        System.out.println("Opération terminée.");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
