package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();


     // a)
        System.out.println("a) Strømforbruk for måneden:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();

     // b)
        System.out.println("b) Strømpris for måneden:");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();

     // c)
        double totalUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println("c) Total strømforbruk: " + totalUsage + " kWh");
        System.out.println();

     // d)
        double threshold = 1000;
        boolean exceeded = MonthlyPower.exceedThreshold(power_usage_month, threshold);
        System.out.println("d Strømforbruk grense overskredet(" + threshold + " kWh): " + exceeded);
        System.out.println();

     // e)
        double totalSpotPrice = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.println("e) Total strømpris for måneden: " + totalSpotPrice + " kr");
        System.out.println();

     // f)
        double totalSupport = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.println("f Total strømstøtte for måneden: " + totalSupport + " kr");
        System.out.println();

     // g)
        double totalNorgespris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("g) Total strømpris for måneden med Norgespris: " + totalNorgespris + " kr");
    }
}