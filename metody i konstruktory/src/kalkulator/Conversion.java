package kalkulator;

public class Conversion {

    public static void main(String[] args) {
       int hours = 12;
       int seconds = 30;
       int minutes = 200;

        double meter = 2.5;
        double centi = 125;
        double milli = 1555;

        MeterConversion conversion = new MeterConversion();
        System.out.print(meter + "m to ");
        System.out.println(conversion.meterToCenti(meter)+"cm");
        System.out.print(meter + "m to ");
        System.out.println(conversion.meterToMilli(meter) + "mm");
        System.out.print(centi + "cm to ");
        System.out.println(conversion.centiToMeter(centi) + "m");
        System.out.print(milli + "mm to ");
        System.out.println(conversion.milliToMeters(milli) + "m");
        System.out.println();
        System.out.println();

        TimeConversion conversion1 = new TimeConversion();
        System.out.print(hours + " godzin to ");
        System.out.println(conversion1.houersToMinutes(hours) + " minut");
        System.out.print( minutes + " minut to ");
        System.out.println(conversion1.minutesToSeconds(minutes) + " sekund");
        System.out.print(seconds + " sekund to ");
        System.out.println(conversion1.secondToMilliseconds(seconds) + " milisekund");


    }
}
