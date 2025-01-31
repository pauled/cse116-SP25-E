package week2;

import java.util.ArrayList;
import java.util.Random;

public class Friday {
    /*
    1) write a static method that takes a size parameter and
    returns an arrayList of length size containing random
    integreters from 0-100
    2) write a static method that takes the output of the
    first method and returns the average of those value
    3) write a static method that takes a parameter of size
    and returns a hashmap of strings to ints of size where
    all strings and ints are radomly generated
    4) write a static method that takes the output of 3 and
    returns the key to the largest value
     */
    public static String randString(int size){
        String out="";
        String alph="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rand=new Random();
        for (int x=0; x<size; x++){
            out+=alph.charAt(rand.nextInt(alph.length()));
        }
        return out;
    }
    public static double getAve(ArrayList<Integer> nums){
        double total=0;
        for (int val : nums){
            total+=val;
        }
        return total/nums.size();
    }
    public static ArrayList<Integer> randInts(int size){
        ArrayList<Integer> out=new ArrayList<>();
        Random rand = new Random();

        for (int x=0; x<size; x++){
            out.add(rand.nextInt(101));
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(randString(10));
        ArrayList<Integer> temp=randInts(3);
        System.out.println(temp);
        System.out.println(getAve(temp));
    }
}
