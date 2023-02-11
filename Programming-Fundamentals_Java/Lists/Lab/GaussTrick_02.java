package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersLIst = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sizeList = numbersLIst.size();
        for (int i = 0; i < sizeList / 2; i++) {
            int firstNum = numbersLIst.get(i);
            int lastNum = numbersLIst.get(numbersLIst.size() - 1);
            numbersLIst.set(i, firstNum + lastNum);
            numbersLIst.remove(numbersLIst.size() - 1);

        }
        for (int item : numbersLIst) {
            System.out.print(item + " ");
        }
    }
}
