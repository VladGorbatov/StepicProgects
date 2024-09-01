package com.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.*;
import java.time.Year;
import java.util.*;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        YearCalculate year = new YearCalculate();
        year.calculate();
        year.choice();
    }
}
