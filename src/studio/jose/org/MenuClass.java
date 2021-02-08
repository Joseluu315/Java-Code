package studio.jose.org;

import java.util.Random;
import java.util.Scanner;

/**
 * Project: Java
 * Date: 07/02/2021 @ 19:26
 * Class: PeopleInfo
 */
public class MenuClass {
    public static void main(String[] args){
        String day;
        int precio = 0;
        String menu = "Food";
        Random rand = new Random();
        int random = 1000000000;
        int id = rand.nextInt(random);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Especifica el dia para indicarte el menu.");
        day = scanner.next();
        if (day.equalsIgnoreCase("Lunes")){
            day = "Lunes";
            System.out.println(
                    "Pedidos:" + "\n" +
                            day + "\n" +
                            "Precio: "+ (precio + 50) + "\n" +
                            "Menu: " + menu + "\n" +
                            "ID:" + id
            );
        }
    }
}
