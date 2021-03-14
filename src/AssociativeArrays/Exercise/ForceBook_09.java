package AssociativeArrays.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, List<String>> users = new TreeMap<>();

        while (!input.equals("Lumpawaroo")) {
            String splitString = "";
//            for (int i = 0; i < input.length(); i++) {
//                char currentSymbol = input.charAt(i);
//                if (currentSymbol == '>') {
//                    splitString = " -> ";
//                    break;
//                } else if (currentSymbol == '|') {
//                    splitString = " \\| ";
//                    break;
//                }
//            }
            if (input.contains(" | ")) {
                splitString = " \\| ";
            } else if (input.contains(" -> ")) {
                splitString = " -> ";
            }
            String[] command = input.split(splitString);
            boolean isFound = false;
            if (splitString.equals(" \\| ")) {
                String userForce = command[1];
                String sideForce = command[0];
                for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                    if (entry.getValue().contains(userForce)) {
                        isFound = true;
                    }
                }
                    if (!isFound) {
                        if (!users.containsKey(sideForce)) {
                            users.put(sideForce, new ArrayList<>());
                            users.get(sideForce).add(userForce);
                        } else {
                            if (!users.get(sideForce).contains(userForce)) {
                                users.get(sideForce).add(userForce);
                            }
                        }
                    }

                } else{
                    String userForce = command[0];
                    String sideForce = command[1];
                    for (Map.Entry<String, List<String>> entry : users.entrySet()) {
                        if (entry.getValue().contains(userForce)) {
                            users.get(entry.getKey()).remove(userForce);
                            break;
                        }
                    }
                    if (!users.containsKey(sideForce)) {
                        users.put(sideForce, new ArrayList<>());
                        users.get(sideForce).add(userForce);
                        System.out.printf("%s joins the %s side!%n", userForce, sideForce);
                    } else {
                        if (!users.get(sideForce).contains(userForce)) {
                            users.get(sideForce).add(userForce);
                            System.out.printf("%s joins the %s side!%n", userForce, sideForce);
                        }
                    }

                }
                input = sc.nextLine();
            }

            users.entrySet().stream()
                    .filter(p -> p.getValue().size() > 0)
                    .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                    .forEach(e -> {
                        System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                        e.getValue().stream()
                                .sorted(String::compareTo)
                                .forEach(student -> System.out.println("! " + student));
                    });
        }
    }



