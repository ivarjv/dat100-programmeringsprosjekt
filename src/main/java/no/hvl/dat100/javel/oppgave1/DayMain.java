package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


     // a)
        System.out.println("a) Strømpris per time:");
        DailyPower.printPowerPrices(powerusage_day);
        System.out.println();

     // b)
        System.out.println("b) Strømforbruk per time");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();

     // c)
        double totalUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.println("c) Totalt strømforbruk for dagen: " + totalUsage + " kWh");

     // d)
        double spotPrice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println("d) Total pris for dagen: " + spotPrice + " kr");

     // e) og f)
        double support = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.println("f) Total Strømstøtte for dagen: " + support + " kr");

     // g)
        double norgesPris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println("g) Totalpris med Norgespris: " + norgesPris + " kr");

     // h)
        double peakUsage = DailyPower.findPeakUsage(powerusage_day);
        System.out.println("h) Høyeste strømforbruk for dagen: " + peakUsage + " kWh");

     // i)
        double avgUsage = DailyPower.findAvgPower(powerusage_day);
        System.out.println("i) Gjennomsnittlig strømforbruk for dagen: " + avgUsage + " kWh");
    }
}
