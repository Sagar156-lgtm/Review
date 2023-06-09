package com.bridgelabz;
/*
Hotel Reservation System

A hotel chain operating in Miami wishes to offer room reservation services over the internet. They
have three hotels in Miami: Lakewood, Bridgewood and Ridgewood. Each hotel has separate
weekday and weekend (Saturday and Sunday) rates. There are special rates for rewards customer
as a part of loyalty program. Each hotel has a rating assigned to it.
Lakewood with a rating of 3 has weekday rates as 110$ for regular customer and 80$ for rewards
customer. The weekend rates are 90 for regular customer and 80 for a rewards customer.
Bridgewood with a rating of 4 has weekday rates as 160$ for regular customer and 110$ for
rewards customer. The weekend rates are 60 for regular customer and 50 for a rewards customer.
Ridgewood with a rating of 5 has weekday rates as 220$ for regular customer and 100$ for rewards
customer. The weekend rates are 150 for regular customer and 40 for a rewards customer.
Can you write a program to help an online customer find the cheapest hotel?
 */

public class Hotel {

        private String hotelName;
        private int hotelRating;
        private int weekDayRatesForRegular;
        private int weekDayRatesForReward;
        private int weekendDayRatesRegular;
        private int weekendDayRatesForReward;

        Hotel(String hotelName,int hotelRating,int weekDayRatesForRegular, int weekDayRatesForReward,int weekendDayRatesRegular, int weekendDayRatesForReward){
            this.hotelName=hotelName;
            this.hotelRating=hotelRating;
            this.weekDayRatesForRegular=weekDayRatesForRegular;
            this.weekDayRatesForReward=weekDayRatesForReward;
            this.weekendDayRatesRegular=weekendDayRatesRegular;
            this.weekendDayRatesForReward=weekendDayRatesForReward;

        }

        @Override
        public String toString() {
            return "Hotel{" +
                    "hotelName='" + hotelName + '\'' +
                    ", hotelRating=" + hotelRating +
                    ", weekDayRatesForRegular=" + weekDayRatesForRegular +
                    ", weekDayRatesForReward=" + weekDayRatesForReward +
                    ", weekendDayRatesRegular=" + weekendDayRatesRegular +
                    ", weekendDayRatesForReward=" + weekendDayRatesForReward +
                    '}';
        }
    }

