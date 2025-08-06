public class App {
    public static void main(String[] args) throws Exception {

        // 1から100までの数字を出力する

        for (int num = 0; num < 101; num++) {

            if (num % 3 == 0 && num % 5 == 0) { //15の倍数の時
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) { //3の倍数の時
                System.out.println("Fizz");
            } else if (num % 5 == 0) { //５の倍数の時
                System.out.println("Buzz");
            } else { //どれでもないとき
                System.out.println(num);
            }

        }

    }
}
