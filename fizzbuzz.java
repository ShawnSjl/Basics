import java.util.ArrayList;
import java.util.List;

class Fizzbuzz {

    public static void main(String[] args) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    result.add("FizzBuzz");
                } else {
                    result.add("Fizz");
                }
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        System.out.println(result.toString());
    }
}
