import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> out = new ArrayList<>();

        for (int i=1; i<=n; i++){
            if (i%3==0 && i%5==0){
                out.add("FizzBuzz");
            } else if (i%3 == 0) {
                out.add("Fizz");
            } else if (i%5 == 0) {
                out.add("Buzz");
            }else {
                out.add("" + i);
            }
        }
        return out;
    }
    public static void main(String[] args) {

    }
}
