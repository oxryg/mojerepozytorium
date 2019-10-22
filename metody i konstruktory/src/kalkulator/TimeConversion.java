package kalkulator;

public class TimeConversion {

    int houersToMinutes(int hours) {
        int minutes = hours * 60;
        return minutes;
    }

    int minutesToSeconds(int minutes) {
        int second = minutes * 60;
        return second;
    }

    int secondToMilliseconds(int seconds) {
        int milliseconds = seconds * 1000;
        return milliseconds;
    }
}

