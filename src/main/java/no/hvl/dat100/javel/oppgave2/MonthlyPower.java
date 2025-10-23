package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

       for (int day = 0; day < usage.length; day++) {
           System.out.println("Dag " + (day + 1) + ":");

           for (int hour = 0; hour < usage[day].length; hour++) {
               System.out.println("Time " + hour + ": " + usage[day][hour] + " kWh");
           }
       }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int day = 0; day < prices.length; day++) {
            System.out.println("Dag " + (day + 1) + ":");

            for (int hour = 0; hour < prices[day].length; hour++) {
                System.out.println("Time " + hour + ": " + prices[day][hour] + " kr/kWh");
            }
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                sum += usage[day][hour];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        for (int day = 0; day < powerusage.length; day++) {
            for (int hour = 0; hour < powerusage[day].length; hour++) {
                usage += powerusage[day][hour];
            }
        }
        if (usage > threshold) {
            exceeded = true;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < prices[day].length; hour++) {
                price += prices[day][hour] * usage[day][hour];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double threshold = 0.9375;
        double precentage = 0.9;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {

                double price = prices[day][hour];
                double power = usage[day][hour];

                if (price > threshold) {
                    support += (price - threshold) * precentage * power;
                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;
        double norgespris = 0.5;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                price += usage[day][hour] * norgespris;
            }
        }

        return price;
    }
}
