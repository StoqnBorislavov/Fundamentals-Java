package PastFinalExams;

import java.util.*;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] hero = sc.nextLine().split(" ");
            String heroName = hero[0];
            int hitPoints = Integer.parseInt(hero[1]);
            int manaPoints = Integer.parseInt(hero[2]);
            heroesMap.put(heroName, Arrays.asList(hitPoints, manaPoints));
        }
        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] commandList = input.split(" - ");
            String command = commandList[0];
            String heroName = commandList[1];
            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandList[2]);
                    String spellName = commandList[3];
                    if (heroesMap.get(heroName).get(1) >= mpNeeded) {
                        heroesMap.get(heroName).set(1, heroesMap.get(heroName).get(1) - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                heroName, spellName, heroesMap.get(heroName).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandList[2]);
                    String attacker = commandList[3];
                    heroesMap.get(heroName).set(0, heroesMap.get(heroName).get(0) - damage);
                    if (heroesMap.get(heroName).get(0) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroName, damage, attacker, heroesMap.get(heroName).get(0));
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesMap.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(commandList[2]);
                    if (heroesMap.get(heroName).get(1) + amount < 200) {
                        heroesMap.get(heroName).set(1, heroesMap.get(heroName).get(1) + amount);
                    } else {
                        amount = 200 - heroesMap.get(heroName).get(1);
                        heroesMap.get(heroName).set(1, 200);
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                    break;
                case "Heal":
                    int increaseHealth = Integer.parseInt(commandList[2]);
                    if (heroesMap.get(heroName).get(0) + increaseHealth < 100) {
                        heroesMap.get(heroName).set(0, heroesMap.get(heroName).get(0) + increaseHealth);
                    } else {
                        increaseHealth = 100 - heroesMap.get(heroName).get(0);
                        heroesMap.get(heroName).set(0, 100);
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, increaseHealth);
                    break;
            }
            input = sc.nextLine();
        }
        heroesMap.entrySet().stream()
                .sorted((left, right) -> {
                            int result = right.getValue().get(0).compareTo(left.getValue().get(0));
                            if (result == 0) {
                                result = left.getKey().compareTo(right.getKey());
                            }
                            return result;
                        }
                ).forEach(e -> {

            System.out.printf("%s%n", e.getKey());
            System.out.printf("HP: %d%n", e.getValue().get(0));
            System.out.printf("MP: %d%n", e.getValue().get(1));

        });


    }
}
