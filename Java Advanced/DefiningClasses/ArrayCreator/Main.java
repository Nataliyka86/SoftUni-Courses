package ArrayCreator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = ArrayCreator.create(10, 777);
        for (Integer integer: integers){
            System.out.print(" " + integer);
        }
    }
}
