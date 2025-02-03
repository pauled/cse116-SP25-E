package week3;

public class CodeToTest {
    public static int add(int a,int b){
        return Math.abs(a)+b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(0,5));
        System.out.println(add(-5,8));
    }
}
