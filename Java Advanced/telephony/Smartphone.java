package telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : this.urls){
            boolean isSymbol = false;
            for (Character symbol : url.toCharArray()){
                if (Character.isDigit(symbol)){
                    sb.append("Invalid URL!").append(System.lineSeparator());
                    isSymbol = true;
                    break;
                }
            }
            if (!isSymbol){
                sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : this.numbers){
        boolean isDigit = false;
            for (Character symbol : number.toCharArray()){
            if (!Character.isDigit(symbol)){
                sb.append("Invalid number!").append(System.lineSeparator());
                isDigit = true;
                break;
            }
            }
            if (!isDigit){
            sb.append("Calling... ").append(number).append(System.lineSeparator());
            }

        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format(this.call() + this.browse());
    }
}
