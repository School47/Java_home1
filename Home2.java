

public class Home2 {
    public static void main(String[] args) {
        boolean isNumberSimple = true;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j ==0) {
                    isNumberSimple = false;
            }
        }
            if (isNumberSimple) {
                 System.out.print(i+ " ");
            }
            isNumberSimple = true;
        }
    }
}
