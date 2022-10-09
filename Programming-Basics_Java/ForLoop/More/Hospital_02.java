package ForLoop.More;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред – периода, за който трябва да направите изчисления. Цяло число в интервала [1 ... 1000]
        //•	На следващите редове(равни на броят на дните) – броя пациенти, които пристигат за преглед за текущия ден. Цяло число в интервала [0…10 000]
        int n = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctor = 7;

        for (int i = 1; i <= n; i++) {
            int patient = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && (untreatedPatients > treatedPatients)) {
                doctor += 1;
            }
            if (patient <= doctor) {
                treatedPatients += patient;
            } else {
                treatedPatients += doctor;
                untreatedPatients += patient - doctor;
            }

        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.%n", untreatedPatients);

    }
}
