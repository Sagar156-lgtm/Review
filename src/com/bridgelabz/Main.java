package com.bridgelabz;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList list=new ArrayList();

            System.out.println("Customer is regular or reward customer?");
            String str = sc.nextLine();

            System.out.println("Enter the start date : ");
            LocalDate startDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            System.out.println("Enter the end date : ");
            LocalDate endDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            DayOfWeek date1= startDate.getDayOfWeek();

            Hotel hotel = new Hotel("Lakewood",3,110,80 ,90,80);

            Hotel hotel2 = new Hotel("Bridgewood",4,160,110 ,60,50);

            Hotel hotel3 = new Hotel("Ridgewood",5,220,100,150,40 );


            list.add(hotel);
            System.out.println(list);

            ArrayList list2 = new ArrayList();
            list2.add(hotel2);
            System.out.println(list2);

            ArrayList list3 = new ArrayList();
            list3.add(hotel3);
            System.out.println(list3);

            System.out.println();
            System.out.println( list3.stream().findFirst());

            System.out.println(list3.stream().distinct());


        }
    }
