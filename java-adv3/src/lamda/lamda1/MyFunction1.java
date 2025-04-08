package lamda.lamda1;

import lamda.MyFunction;

public class MyFunction1 {
    public static void main(String[] args) {
        MyFunction myFunction = (a, b) -> {
            return a + b;
        };

        int result = myFunction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
