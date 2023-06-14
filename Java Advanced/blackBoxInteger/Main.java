package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true); //правя конструктора достъпен
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Field innerValue = clazz.getDeclaredField("innerValue");
        List<Method> methods = Arrays.asList(clazz.getDeclaredMethods());
        while (!command.equals("END")) {
            String commandName = command.split("_")[0];
            int number = Integer.parseInt(command.split("_")[1]);
            switch (commandName) {
                case "add":
                    executeCommand(blackBoxInt, number, innerValue, "add", methods);
                    break;
                case "subtract":
                    executeCommand(blackBoxInt, number, innerValue, "subtract", methods);
                    break;
                case "divide":
                    executeCommand(blackBoxInt, number, innerValue, "divide", methods);
                    break;
                case "multiply":
                    executeCommand(blackBoxInt, number, innerValue, "multiply", methods);
                    break;
                case "rightShift":
                    executeCommand(blackBoxInt, number, innerValue, "rightShift", methods);
                    break;
                case "leftShift":
                    executeCommand(blackBoxInt, number, innerValue, "leftShift", methods);
                    break;
            }
            command = scanner.nextLine();
        }

    }

    private static void executeCommand(BlackBoxInt blackBoxInt, int number, Field innerValue, String command, List<Method> methods) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method currentMethod = null;
        for (Method method : methods) {
            if (method.getName().equals(command)) {
                currentMethod = method;
                break;
            }
        }
        currentMethod.setAccessible(true);
        currentMethod.invoke(blackBoxInt, number);
        innerValue.setAccessible(true);
        System.out.println(innerValue.get(blackBoxInt));
    }
}
