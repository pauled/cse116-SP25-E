package week3;

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
    public static String pm(int score){
        int ones=score%10;
        if (score>=97) {
            return "";
        } else if (score<60) {
            return "";
        }else if (ones>=8){
            return "+";
        } else if (ones>2){
            return "";
        } else {
            return "-";

        }
    }
    public static boolean compareDoubles(double a,double b){
        if (Math.abs(a-b)<.0001){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a="hello ";
        String b="goodbye";
        String c=a+b;
        System.out.println("hello goodbye"==c);
        System.out.println(c);
        System.out.println("hello goodbye".equals(c));
        double total=0;
        for (int x =0; x<100;x++){
            total+=.1;
            System.out.println(total);
        }
    }
}
