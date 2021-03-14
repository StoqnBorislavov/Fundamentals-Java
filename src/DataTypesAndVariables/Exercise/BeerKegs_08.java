package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countKegs = Integer.parseInt(sc.nextLine());
        double maxVolume = 0;
        String modelOfMaxVolumeKeg = "";


        for (int i = 0; i < countKegs; i++) {
            String model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                modelOfMaxVolumeKeg = model;
            }

        }
        System.out.println(modelOfMaxVolumeKeg);
    }
}
