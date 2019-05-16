package utils;

public class RegexUtil {
    public static boolean isValidEmail(String email){
        return email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    }
    public static boolean isValidFirstOrLastname(String name){
        if(name.length() == 0 || name.length() > 100){
            return false;
        }else if(name.matches(".*\\d.*")){
            //If contains number
            return false;
        }else{
            return true;
        }
    }
    public static boolean isValidDob(String dob){
        //TODO: Fix implem.
        return false;
    }
    public static boolean isValidTelnr(String telnr){
        if(telnr.length() == 0 && telnr.length() > 20){
            return false;
        }else if(!telnr.matches("^[0-9]*$")){
            //Only contains number
            return false;
        }else{
            return true;
        }
    }
    public static boolean isValidPassword(String pass){
        //TODO: Fix implem.
        return false;
    }
}
