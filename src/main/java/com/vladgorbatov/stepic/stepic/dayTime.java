package com.vladgorbatov.stepic.stepic;

class dayTime {

    public static void main(String args[]) {
        System.out.println(daytime(7));     // Good morning
        System.out.println(daytime(13));    // Good after noon
        System.out.println(daytime(18));    // Good evening
        System.out.println(daytime(2));     // Good night
        System.out.println(daytime(30));    // Invalid data
    }

    static String daytime(int hour) {
        if (hour > 23 || hour < 0)
            return "Invalid data";
        if (hour > 21 || hour < 6)
            return "Good night";
        if (hour >= 15)
            return "Good evening";
        if (hour >= 11)
            return "Good after noon";
        return "Good morning";
    }
}
