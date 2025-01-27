package week2;

public class PlusMinus {
    public static String letter(int score){
        int tens=score/10;
        if (tens>=9){
            return "A";
        } else if (tens>=8){
            return "B";
        } else if (tens>=7){
            return "C";
        } else if (tens>=6){
            return "D";
        } else {
            return "F";
        }
    }
    /*
    define a function that takes an integer and prints all the
    integer and integer squared combinations from 1 to input
    integer. It does not return anything
     */
    public static void printDoubles(int num){
        for (int i=1;i<=num;i++){
            System.out.println(i+" "+i*i);
        }
    }

    public static void main(String[] args) {
        System.out.println(letter(9));
        System.out.println(letter(85));
        System.out.println(letter(60));

        double val=10;
        while (val>1){
            System.out.println(val);
            val/=2;//the  same as val=val/2
            int val22=1;
        }
        for (int x=0; x<5; x++){//x++ is the same as x+=1
            int bob=x;
            System.out.println(x);
        }
        printDoubles(10);
    }
}
