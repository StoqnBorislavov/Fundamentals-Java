package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        •	The amount of money Ivan Cho has – floating-point number in range [0.00…1,000.00]
//•	The count of students – integer in range [0…100]
//•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
//•	The price of robes for a single robe – floating-point number in range [0.00…100.00]
//•	The price of belts for a single belt – floating-point number in range [0.00…100.00]
        double money = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightsabersPrice = Double.parseDouble(sc.nextLine());
        double robesPrice = Double.parseDouble(sc.nextLine());
        double beltsPrice = Double.parseDouble(sc.nextLine());
//        Because the lightsabres sometimes brake, Ivan Cho should buy 10% more,
//            rounded up to the next integer. Also, every sixth belt is free.
        int freeBelt = students / 6;
        double neededMoney = lightsabersPrice * (Math.ceil(students * 1.1)) + robesPrice * students + beltsPrice * (students - freeBelt);
        if (neededMoney <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", neededMoney - money);
        }

    }
}
