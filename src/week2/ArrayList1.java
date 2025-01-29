package week2;

import java.util.ArrayList;

public class ArrayList1 {
    public  static int sum(ArrayList<Integer> vals){
        int out=0;
        for (int x=0;x<vals.size();x++){
            out+=vals.get(x);
        }
        return out;
    }

    public static void main(String[] args) {
        Integer num=4;
        int num2=num+5;
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int x=0; x<4; x++){
            arr1.add(x+1);
        }
        for (int x=0;x<4; arr1.add(x+1),x++){

        }
        System.out.println(arr1);
        int temp=sum(arr1);
        System.out.println(temp);
    }
}
