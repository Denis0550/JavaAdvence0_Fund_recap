public class VarargsEx {

    public void addition(int... numbers) {
        int total = 0;
        int[] arr = numbers;
        int len = numbers.length;

        for(int i = 0; i < len; i++) {
            int x = arr[i];
            System.out.println("value of x: " + x);
            total += x;
        }

        System.out.println("Addition: " + total);
    }

    public void billInfo(String who, int... numbers) {
        int total = 0;
        int[] arr = numbers;
        int len = numbers.length;

        for(int i = 0; i < len; i++) {
            int x = arr[i];
            total += x;
        }

        System.out.println("The bill for " + who + " is " + total);
    }

//    public void sayHi(String name, String name2) {
//        System.out.println("HIIIIIIIIII " + name);
//        System.out.println("Hiiiiii " + name2);
//    }


    public static void main(String[] args) {
        VarargsEx obj = new VarargsEx();
//        obj.sayHi("Denis", "Yohan");
        obj.addition(1, 2, 3, 4, 5, 6, 1000);
        obj.billInfo("Yohan", 5, 7, 3);
    }
}