package ObjectsAndClasses.Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(sc.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] song = sc.nextLine().split("_");
            String typeList = song[0];
            String name = song[1];
            String type = song[2];

            Song songForList = new Song(typeList, name, type);

            songList.add(songForList);
        }
        String neededTypeOfSongs = sc.nextLine();
        if (!neededTypeOfSongs.equals("all")) {
            for (int i = 0; i < songList.size(); i++) {
                if (songList.get(i).getTypeList().equals(neededTypeOfSongs)) {
                    System.out.println(songList.get(i).getName());
                }
            }
        } else {
            for (int i = 0; i < songList.size(); i++) {
                System.out.println(songList.get(i).getName());
            }
        }

    }
}
