package com.AssessmentLevelPrograms.CarProTaxiService;
import java.time.*;
import java.util.*;

public class BookCabMain {

    private Map<String, Date> bookingMap;

    //Getter
    public Map<String, Date> getBookingMap() {
        return bookingMap;
    }

    //Setter
    public void setBookingMap(Map<String, Date> bookingMap) {
        this.bookingMap = bookingMap;
    }

    public List<String> findCabBookingIdsForTheBookingDate(Date date) {

        List<String> resultList = new ArrayList<>();

        if(bookingMap != null) {
            for(Map.Entry<String, Date> entry : bookingMap.entrySet()) {
                if(entry.getValue().equals(date)) {
                    resultList.add(entry.getKey());
                }
            }
        }

        return resultList;
    }
}
