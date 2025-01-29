package week2;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Knox",88);
        bills.put("Allen",17);
        for (String key : bills.keySet()){
            System.out.println(key);
        }
        for (Integer bob : bills.values()){
            System.out.println(bob);
        }
    }
}
