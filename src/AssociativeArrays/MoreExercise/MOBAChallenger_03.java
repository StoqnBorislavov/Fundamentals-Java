package AssociativeArrays.MoreExercise;

import java.util.*;

public class MOBAChallenger_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, List<Map<String, Integer>>> playersMap = new HashMap<>();
        while(!input.equals("Season end")){
            String regexForSplit = "";
            if(input.contains("->")){
                regexForSplit = " -> ";
            } else {
                regexForSplit = " vs ";
            }
            String[] command = input.split(regexForSplit);
            if(command.length == 2){
                String firstPlayer = command[0];
                String secondPlayer = command[1];
                if(playersMap.containsKey(firstPlayer) && playersMap.containsKey(secondPlayer)) {
                    battleThem(firstPlayer, secondPlayer, playersMap);
                }
            } else if (command.length == 3){
                String player = command[0];
                String position = command[1];
                int skills = Integer.parseInt(command[2]);
                addPlayer(player, position, skills, playersMap);
            }
            input = sc.nextLine();
        }
    }

    private static void battleThem(String firstPlayer, String secondPlayer, Map<String, List<Map<String, Integer>>> playersMap) {






    }

    private static void addPlayer(String player, String position, int skills, Map<String, List<Map<String, Integer>>> playersMap) {
        if(!playersMap.containsKey(player)){
            playersMap.put(player, new ArrayList<>());
            Map<String, Integer> currentPosition = new HashMap<>();
            currentPosition.put(position, skills);
            playersMap.get(player).add(currentPosition);
        } else if (playersMap.containsKey(player)){
            playersMap.get(player).stream()
                    .forEach( e ->{
                        if(e.containsKey(position)) {
                            if (e.get(position) <= skills) {
                                e.put(position, skills);
                            }
                        } else{
                            e.put(position, skills);
                        }
                    });
        }

    }
}
