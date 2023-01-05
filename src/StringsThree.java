public class StringsThree {

    public static void main(String[] args) {

        //Return Values
        String str1, str2, str3; //null and "";
        str1 = "abcd";
        str2 = "efgh";

        String str4 = "xyz";

        str3 = str1.concat(str2).concat(str4);
        System.out.println(str3);



        System.out.println("****************");



        //ONLY on not null... otherwise error
        int len = str3.length();
        System.out.println(len);

    }
}
