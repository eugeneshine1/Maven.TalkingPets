package io.zipcoder.polymorphism;



import java.sql.SQLOutput;
import java.util.*;

public class MainApplication {
    public static void main (String [] pets) {

        System.out.println("How many pets do you have?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
//        HashMap<String,String> petss = new HashMap<>();
//        for (int x=0; x<num; x++) {
//            System.out.println("What kind of animal is pet number " + x + "?");
//            Scanner scan1 = new Scanner(System.in);
//            String type = scan1.nextLine();
//            System.out.println("What is pet number " + x + "'s name?");
//            Scanner scan2 = new Scanner(System.in);
//            String name = scan2.nextLine();
//            if (x<num) {
//                petss.put(type,name);
//            }
//        }
//        System.out.println(petss.entrySet());
        Pet [] petty = new Pet[num];
        for (int x = 0; x<num; x++) {
            System.out.println("Is pet number " + x + " a dog, cat, or fish?");
            String type = scan.next().toLowerCase();
            String name = "";
            switch (type) {
                case "dog":
                    System.out.println("What is the dog's name?");
                    name = scan.next().toLowerCase();
                    petty[x] = new Dog(name);
                    break;
                case "cat":
                    System.out.println("What is the cat's name?");
                    name = scan.next();
                    petty[x] = new Cat(name);
                    break;
                case "fish":
                    System.out.println("What is the fish's name?");
                    name = scan.nextLine();
                    petty[x] = new Fish(name);
                    break;
                default:
                    System.out.println("Not my pet...");
                    break;
            }
        }
            for (Pet pet : petty) {
                System.out.println(pet.getName()+ " says " +pet.speak());
            }





    }


}

