package com.suntri.jaxb;

public class BooleanAdapter {

    public static Boolean parseYN(String str){
        if(str!=null && str.length()>0){
            char c = str.charAt(0);
            if(c=='N' || c=='n'){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static String printYN(Boolean b){
        return b ? "Y" : "N";
    }
}
