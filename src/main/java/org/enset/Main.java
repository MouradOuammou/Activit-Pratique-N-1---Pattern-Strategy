package org.enset;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while(true){

            System.out.println("Quelle stratégie voulez-vous utiliser ? (1, 2, default, exit)");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    context.setStrategy(new StrategyImpl1());
                    context.effectuerOperation();
                    break;
                case "2":
                    context.setStrategy(new StrategyImpl2());
                    context.effectuerOperation();
                    break;
                case "default":
                    context.setStrategy(new DefaultStrategyImpl());
                    context.effectuerOperation();
                    break;
                case "exit":
                    System.out.println("Au revoir!");
                    System.exit(0);
                default:
                    System.out.println("Stratégie inconnue");
                    break;
            }
        }
    }
}