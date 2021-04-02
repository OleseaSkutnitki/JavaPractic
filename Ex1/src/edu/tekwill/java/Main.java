package edu.tekwill.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Clasa1 ob=new Clasa1();
        ob.nr=1;
        System.out.println("Hello Tekwill");
        ob.afisareSalut();*/
        /*int intVariable = 34;
        float floatVar = 23.5f;
        double doubleVar = 34.5;
        boolean booleanVar = true;
        System.out.println(intVariable);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(booleanVar);
        String name = "Olesea";
        String surname = "Skutnitki";
        String message;
        message = "My name is " + name + " " + surname;
        System.out.println(message);
        double price=65.4;
        double tax=13;
        int cuanti=4;
        double total;
        String message1="I want to buy "+cuanti+" books";
        total=price*cuanti*tax;
        String mess2="Total coast is "+total;
        System.out.println(message1);
        System.out.println(mess2);
        Scanner sc=new Scanner(System.in);
        String name1;
        String surname1;
        System.out.println("Nr");
        int nr=sc.nextInt();
        sc.nextLine();
        System.out.println("Introdu numele");
        name1=sc.nextLine();
        System.out.println("Introdu prenumele");
        surname1=sc.nextLine();*/
        Scanner sc = new Scanner(System.in);
       /* double nr1,nr2,sum,prod,dif,imp;
        System.out.println("First number");
        nr1=sc.nextDouble();
        System.out.println("Second number");
        nr2=sc.nextDouble();
        sum=nr1+nr2;
        System.out.println("Sum of "+nr1+" and "+nr2+" is "+sum);
*/
//        int num1, num2, maxim;
//        System.out.println("Dati primul numar ");
//        num1 = sc.nextInt();
//        System.out.println("Dati numarul al doile");
//        num2 = sc.nextInt();
//        if (num1 > num2) System.out.println("Primul mai mare");
//        else if (num2 > num1) System.out.println("Al doilea mai mare");
//        else System.out.println("Egale");
//        maxim=(num1>num2)?num1:num2;
//        System.out.println("Maximul dintre "+num1+" si "+num2+" este "+maxim);
        byte nr;
        System.out.println("Da'i numarul zilei");
        nr = sc.nextByte();
        switch (nr) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Nu avem asa zi in saptamina");
        }


    }
}
