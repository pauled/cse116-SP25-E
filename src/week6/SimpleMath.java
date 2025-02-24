package week6;

public class SimpleMath {
    public static int factorial(int n){
        if (n==0){
            return 1;
        } else if(n<0){
            return -1;
        }else {
            return factorial(n-1)*n;
        }
    }
    public static int factorialTail(int n){
        return factorialTailHelper(n,1);
    }
    public static int factorialTailHelper(int n,int total){
        if (n==0){
            return total;
        } else if(n<0){
            return -1;
        }else {
            return factorialTailHelper(n-1,total*n);
        }
    }
    public static int multiplyInt(int x,int y){
        if (x==0 || y==0){//  || or, && and, ! not
            return 0;
        }
        boolean xNeg=x<0;
        boolean yNeg=y<0;
        int result=multiplyIntHelper(Math.abs(x),Math.abs(y));
        if (yNeg ^ xNeg){//(yNeg!=xNeg)
            return -1*result;
        } else {
            return result;
        }
    }
    public static int multiplyIntHelper(int x, int y){
        if (y==1){
            return x;
        } else {
            return x+multiplyIntHelper(x,y-1);
        }
    }
}
