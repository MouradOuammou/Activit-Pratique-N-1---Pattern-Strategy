package org.enset;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String,Strategy> map = new HashMap<>();
        Strategy strategy ;
        while(true){

            System.out.println("Quelle stratégie voulez-vous utiliser ? (1, 2, default, exit)");
            String input = scanner.nextLine();
            strategy = map.get(input);
            if(strategy == null){
                strategy = (Strategy)Class.forName("org.enset.StrategyImpl"+input).getConstructor().newInstance();
                map.put(input,strategy);
            }
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