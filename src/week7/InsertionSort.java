package week7;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort <T>{
    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> comparator){
        this.comparator=comparator;
    }
    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> out=new ArrayList<>();
        for (T valueToInsert : input){
            int location=0;
            for (T valueToCompare : out){
                if (this.comparator.compare(valueToCompare,valueToInsert)){
                    location++;
                }
            }
            out.add(location,valueToInsert);
        }
        return out;
    }

    public static void main(String[] args) {
        InsertionSort<Integer> sorter=new InsertionSort<>(new IntIncreasing());
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);

        InsertionSort<Weapon> sorter2=new InsertionSort<>(new PowerDecreasing());
        ArrayList<Weapon> weapons=new ArrayList<>(Arrays.asList(
                new Weapon(0,0,20),
                new Weapon(5,2,2),
                new Weapon(2,1,13),
                new Weapon(1,2,15),
                new Weapon(10,10,25)
        ));
        ArrayList<Weapon> sortedWeapons=sorter2.sort(weapons);
        System.out.println(sortedWeapons);
    }
}
