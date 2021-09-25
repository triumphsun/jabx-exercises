package com.suntri.jaxb;

public enum Gender{
    MALE, FEMALE;

    public static Gender parseMF(String str){
        if(str!=null && str.length()>0){
            char c = str.charAt(0);
            if(c=='f' || c=='F'){
                return FEMALE;
            }
        }
        return MALE;
    }

    public static String printMF(Gender gender){
        return gender.equals(MALE) ? "M" : "F";
    }
}
