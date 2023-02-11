package Scale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> scale = new Scale<>(100, 158);
        System.out.println(scale.getHeavier());
    }
}
