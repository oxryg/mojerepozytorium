package kalkulator;

public class MeterConversion {

    double meterToCenti(double meter) {
        double centi = meter * 100;
        return centi;
    }

    double meterToMilli(double milli) {
        double meter = milli * 1000;
        return meter;
    }

    double centiToMeter(double centi) {
        double meter = centi / 100;
        return meter;
    }

    double milliToMeters(double milli) {
        double meter = milli / 1000;
        return meter;
    }
}
