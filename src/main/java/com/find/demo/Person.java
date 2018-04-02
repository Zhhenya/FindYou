package com.find.demo;

import java.util.Date;
import java.util.Vector;

public class Person {
    private String name;
    class AboutPerson{
        String date;
        String entryTtime;
        String exitTime;
        int roomNumberEntry;
        int roomNumbertExit;
        String durationOfStay;
    }
    private Vector<AboutPerson> dataAboutAPerson;
    private String allTime;
    private long personneNumber;

    public Person(){
        dataAboutAPerson = new Vector<>();
        name = "";
        allTime = "";
        personneNumber = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAllTime(String allTime) {
        this.allTime = allTime;
    }
    public String getAllTime() {
        return allTime;
    }

    public void setPersonneNumber(long personneNumber) {
        this.personneNumber = personneNumber;
    }
    public long getPersonneNumber() {
        return personneNumber;
    }

    public Vector<AboutPerson> getDataAboutAPerson() {
        return dataAboutAPerson;
    }

    /* private Vector<String> entryTtime;//Time???
    private Vector<String> exitTime;
    private Vector<String> accessPointEntry;
    private Vector<String> accessPointExit;
    private Vector<String> durationOfStay;*/

}
