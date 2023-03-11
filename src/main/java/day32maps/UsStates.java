package day32maps;

import java.util.Arrays;

public enum UsStates {

    ALABAMA("Alabama", "AL", "Montgomery"),
    ALASKA("Alaska", "AK", "Juneau"),
    AMERICAN_SAMOA("American Samoa", "AS", "Pago Pago"),
    ARIZONA("Arizona", "AZ", "Phoenix"),
    ARKANSAS("Arkansas", "AR", "Little Rock"),
    CALIFORNIA("California", "CA", "Sacramento"),
    COLORADO("Colorado", "CO", "Denver"),
    CONNECTICUT("Connecticut", "CT", "Hartford"),
    DELAWARE("Delaware", "DE", "Dover"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "DC", "Washington"),
    FLORIDA("Florida", "FL", "Tallahassee"),
    GEORGIA("Georgia", "GA", "Atlanta"),
    GUAM("Guam", "GU", "Hagatna"),
    HAWAII("Hawaii", "HI", "Honolulu"),
    IDAHO("Idaho", "ID", "Boise"),
    ILLINOIS("Illinois", "IL", "Springfield"),
    INDIANA("Indiana", "IN", "Indianapolis"),
    IOWA("Iowa", "IA", "Des Moines"),
    KANSAS("Kansas", "KS", "Topeka"),
    KENTUCKY("Kentucky", "KY", "Frankfort"),
    LOUISIANA("Louisiana", "LA", "Baton Rouge"),
    MAINE("Maine", "ME", "Augusta"),
    MARSHALL_ISLANDS("Marshall Islands", "", "Majuro"),
    MARYLAND("Maryland", "MD", "Annapolis"),
    MASSACHUSETTS("Massachusetts", "MA", "Boston"),
    MICHIGAN("Michigan", "MI", "Lansing"),
    MINNESOTA("Minnesota", "MN", "Saint Paul"),
    MISSISSIPPI("Mississippi", "MS", "Jackson"),
    MISSOURI("Missouri", "MO", "Jefferson City"),
    MONTANA("Montana", "MT", "Helena"),
    NEBRASKA("Nebraska", "NE", "Lincoln"),
    NEVADA("Nevada", "NV", "Carson City"),
    NEW_HAMPSHIRE("New Hampshire", "NH", "Concord"),
    NEW_JERSEY("New Jersey", "NJ", "Trenton"),
    NEW_MEXICO("New Mexico", "NM", "Santa Fe"),
    NEW_YORK("New York", "NY", "Albany"),
    NORTH_CAROLINA("North Carolina", "NC", "Raleigh"),
    NORTH_DAKOTA("North Dakota", "ND", "Bismarck"),
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", "MP", "Saipan"),
    OHIO("Ohio", "OH", "Columbus"),
    OKLAHOMA("Oklahoma", "OK", "Oklahoma City"),
    OREGON("Oregon", "OR", "Salem"),
    PENNSYLVANIA("Pennsylvania", "PA", "Harrisburg"),
    PUERTO_RICO("Puerto Rico", "PR", "San Juan"),
    RHODE_ISLAND("Rhode Island", "RI","Providence"),
    SOUTH_CAROLINA("South Carolina", "SC", "Columbia"),
    SOUTH_DAKOTA("South Dakota", "SD", "Pierre"),
    TENNESSEE("Tennessee", "TN", "Nashville"),
    TEXAS("Texas", "TX", "Austin"),
    US_VIRGIN_ISLANDS("US Virgin Islands", "VI", "Charlotte Amalie"),
    UTAH("Utah", "UT", "Salt Lake City"),
    VERMONT("Vermont", "VT", "Montpelier"),
    VIRGINIA("Virginia", "VA", "Richmond"),
    WASHINGTON("Washington", "WA", "Olympia"),
    WEST_VIRGINIA("West Virginia", "WV", "Charleston"),
    WISCONSIN("Wisconsin", "WI", "Madison"),
    WYOMING("Wyoming", "WY", "Cheyenne");

    private final String stateName;
    private final String abbrevation;
    private final String capital;

    UsStates(String stateName, String abbrevation, String capital) {
        this.stateName = stateName;
        this.abbrevation = abbrevation;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public String getCapital() {
        return capital;
    }

    public static String getStateNameFromAbbreviation(String abbreviation) {
        return Arrays.stream(values()).filter(UsStates->UsStates.getAbbrevation().equals(abbreviation)).findFirst().get().getStateName();
    }

    public static String getStateNameFromCapital(String capital){
        return Arrays.stream(values()).filter(t->t.getCapital().equals(capital)).findFirst().get().getStateName();
    }

    //Example 1: Başkenti verilen state'in kisaltmasini ekrana yazıdran methodu oluşturunuz.


    public static String getAbbrevationFromCapital (String capital){
        return Arrays.stream(values()).filter(t->t.getCapital().equals(capital)).findFirst().get().getAbbrevation();
    }




}
