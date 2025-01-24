package week1;

public class Hello {
    public static double multiplyByTwo(double input){
        double out=input*2;
        return out;
    }

    public static void main(String[] args) {
        double temp=multiplyByTwo(6);
        System.out.println(temp);
        System.out.println("Wow, I'm text!");
        int num = 5;
        double num2=2.3;
        String str1="I am a string";//strings can only be double quotes
        boolean bool1 = true;
        double num3=(double)6/4;
        num3=6/4.0;
        System.out.println("watch me pring num: "+num3);
    }
}
