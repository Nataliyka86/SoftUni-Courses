package ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(15);
        System.out.println(ListUtils.getMin(ints));
        System.out.println(ListUtils.getMax(ints));
    }
}
