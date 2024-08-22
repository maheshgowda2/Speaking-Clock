package com.example.timetowords.service;

import org.springframework.stereotype.Service;

public class TimeService {

    public String convertTimeToWords(String time) {
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        
        if (hours == 12 && minutes == 0) {
            return "It's Midday";
        } else if (hours == 0 && minutes == 0) {
            return "It's Midnight";
        }

        String hourWord = numberToWords(hours % 12 == 0 ? 12 : hours % 12);
        String minuteWord = minutes == 0 ? "" : numberToWords(minutes);

        if (minutes == 0) {
            return "It's " + hourWord;
        } else {
            return "It's " + hourWord + " " + minuteWord;
        }
    }

    private String numberToWords(int number) {
        if (number == 0) return "zero";
        if (number == 1) return "one";
        if (number == 2) return "two";
        if (number == 3) return "three";
        if (number == 4) return "four";
        if (number == 5) return "five";
        if (number == 6) return "six";
        if (number == 7) return "seven";
        if (number == 8) return "eight";
        if (number == 9) return "nine";
        if (number == 10) return "ten";
        if (number == 11) return "eleven";
        if (number == 12) return "twelve";
        if (number == 13) return "thirteen";
        if (number == 14) return "fourteen";
        if (number == 15) return "fifteen";
        if (number == 16) return "sixteen";
        if (number == 17) return "seventeen";
        if (number == 18) return "eighteen";
        if (number == 19) return "nineteen";
        if (number >= 20 && number < 30) return "twenty " + numberToWords(number - 20);
        if (number >= 30 && number < 40) return "thirty " + numberToWords(number - 30);
        if (number >= 40 && number < 50) return "forty " + numberToWords(number - 40);
        if (number >= 50 && number < 60) return "fifty " + numberToWords(number - 50);
        return "";
    }
}
