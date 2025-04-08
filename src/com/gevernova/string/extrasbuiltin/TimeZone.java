package com.gevernova.string.extrasbuiltin;

import java.time.ZonedDateTime;
import java.time.ZoneId;
class TimeZone{
    public static void main(String args[]){
       System.out.println("GMT time :  "+ZonedDateTime.now(ZoneId.of("GMT")));
       System.out.println("IST time : "+ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
       System.out.println("PST time : "+ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }
}