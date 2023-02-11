package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] wagonsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean noMorePeople = false;

        for (int i = 0; i < wagonsArr.length; i++) {
            if (people == 0) {
                noMorePeople = true;
                break;
            }
            int countPeopleInWagon = wagonsArr[i];
            if (countPeopleInWagon == 4) {
                continue;
            }
            int countPeopleGetOnWagon = 4 - countPeopleInWagon;
            if (people >= countPeopleGetOnWagon) {
                people -= countPeopleGetOnWagon;
            } else {
                wagonsArr[i] += people;
                noMorePeople = true;
                break;
            }
            wagonsArr[i] = 4;
        }
        if (wagonsArr[wagonsArr.length - 1] == 4 && people == 0) {
            printArr(wagonsArr);
        } else if (noMorePeople) {
            System.out.println("The lift has empty spots!");
            printArr(wagonsArr);
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            printArr(wagonsArr);
        }

    }

    public static void printArr(int[] wagonsArr) {
        for (int i : wagonsArr) {
            System.out.print(i + " ");
        }
    }
}
