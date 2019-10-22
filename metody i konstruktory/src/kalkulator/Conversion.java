package kalkulator;

public class Conversion {

    public static void main(String[] args) {
        
       TimeConversion conversion1 = new TimeConversion();
        int hours = 12;
        int minutes = conversion1.houersToMinutes(hours);
        int seconds = conversion1.minutesToSeconds(minutes);
        
        System.out.print(hours + " godzin to ");
        System.out.println(minutes + " minut");
        System.out.print( minutes + " minut to ");
        System.out.println(seconds + " sekund");
        System.out.print(seconds + " sekund to ");
        System.out.println(conversion1.secondToMilliseconds(seconds) + " milisekund");
        System.out.println();
                
        MeterConversion conversion = new MeterConversion();
        double meter = 7.35;
        double centi = conversion.meterToCenti(meter);
        double milli = conversion.meterToMilli(meter);

        System.out.print(meter + "m to ");
        System.out.println(centi + "cm");
        System.out.print(meter + "m to ");
        System.out.println(milli + "mm");
        System.out.print(centi + "cm to ");
        System.out.println(conversion.centiToMeter(centi) + "m");
        System.out.print(milli + "mm to ");
        System.out.println(conversion.milliToMeters(milli) + "m");     

    }
}
