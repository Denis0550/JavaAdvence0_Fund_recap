public class AndAndOrOr {
    public static void main(String[] args) {

        String str = null;
        //System.out.println(str.length());

        if((str==null) || (str.length()==9)){
            System.out.println("whohohooohoh");
        }
        // short circuit operator checks firs cond ,  one | will check every condition


        int x=0, y=0;
        if((x==0) & (y==0)){
            System.out.println("both x and y are = 0");
        }

        if((x==0) & (++y == 1)){
            System.out.println("it ran!!!");
        }


        System.out.println("xxxxxxxxxxxxxxxxxxxx");

        y=0;
        if((x==5) && (++y == 1)){

        }

        System.out.println( x + " ... " + y);



    }
}
