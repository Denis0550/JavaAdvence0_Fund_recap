public class Fibonacci {

    //        Fibonacci sequence
    //        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.

    public static void main(String[] args) {

        int prevNum = 0;
        int presentNum = 1;
        int total = 0;



        for (int i = 0; i < 20; i++) {

            total = prevNum + presentNum;

            System.out.println( prevNum + " + " + presentNum +" = " + total);
//            System.out.println(total);

            prevNum = presentNum;
            presentNum = total;

        }









    }
}
