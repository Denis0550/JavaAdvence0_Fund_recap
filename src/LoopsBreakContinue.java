public class LoopsBreakContinue {

    public static void main(String[] args) {

        for(int i=0; i<=10; i++){
            if(i<5){
                System.out.println("Less than 5: " + i);
            }
            else{
                System.out.println("Between 5-10: " + i);
            }
        }

        System.out.println("==================");

        for(int i=0; i<=10; i++){

            if(i==6){ break;  }

            System.out.println("i: " + i);
        }

        System.out.println("==================");


        for(int i=0;i<=10;i++){

            if(i%2 == 0) { continue; }//skips

            System.out.println("i: " + i);

        }

        System.out.println("xxxxxxxxxxxxxxxxxx");

        for(int i=0;i<=10;i++){
            if(i==5 || i==6 || i==7) { continue; }//skips

            System.out.println("i: " + i);
        }







    }



}
