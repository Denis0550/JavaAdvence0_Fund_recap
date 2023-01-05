import java.util.Arrays;

public class Fibonacci2 {
    public static void main(String[] args) {

        fibonacciSequence(5);

//        Fibonacci2 f = new Fibonacci2();
//
//        f.fibonacciSequence(10);

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//        int firstNumber = 0;
//        int secondNumber = 1;
//        int thirdNumber;
//
//        System.out.print(firstNumber + ", ");
//        System.out.print(secondNumber + ", ");
//
//        for (int i = 0; i < 5; i++) {
//
//            thirdNumber = firstNumber + secondNumber;
//            System.out.print(thirdNumber + ", ");
//
//            firstNumber = secondNumber;
//            secondNumber = thirdNumber;
        String s = "S";
        char c = s.charAt(0);
        System.out.println(c);
        //toCharArray()
        //char c = Character.valueOf(s);//error
        // how to change String into a char

        }


    public static void fibonacciSequence(int n) {

        int[] arrayF = new int[n];
        arrayF[0] = 0;
        arrayF[1] = 1;
        arrayF[2] = arrayF[0] + arrayF[1];

        for (int i = 3; i < n; i++) {
            arrayF[i] =  arrayF[i-2] +  arrayF[i-1];
        }
        System.out.println(Arrays.toString(arrayF));

    }

}



