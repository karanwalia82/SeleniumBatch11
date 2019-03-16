import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String mStr = "123";
        long m = new Long(mStr);
        float y = 123_456f;
        boolean bool = true|false;
        boolean bool1 = true||false;

        String name = "";
        System.out.println(name);

        String[][][] arr = {{ {"a","b","c"},{"d","e", null} }, { {"X"},null}, {{"Y"}},{ {"Z", "P"},{""}}};
        System.out.println((arr[0][0][0]));
        System.out.println((arr[1][0][0]));
        System.out.println((arr[2][0][0]));
        System.out.println((arr[3][0][0]));
        System.out.println((arr[3][1][0]));

//        String names [] [] = {{"Danny", "Dan"},{"Johhny"}};
//        System.out.println(names[0][0]);
//        System.out.println(names[0][1]);
//        System.out.println(names[1][0]);
//        //System.out.println(names[1][1]);
//
//        try{
//
//            //String games [][][] = {{{"Contra", "Mario"}}};
//            String games [][][] = new String[3][3][3];
//            System.out.println((games [0][0][0] = "Contra"));
//            System.out.println((games[2][2][2] = "Mario"));
//            System.out.println((games[2][2][3] = "Donkey-Kong"));
//        }catch(ArrayIndexOutOfBoundsException ex){
//            System.out.println("1");
//            System.out.println(ex);
//            System.out.println("---------------------------");
//            System.out.println("2");
//            System.out.println(ex.getMessage());
//            System.out.println("---------------------------");
//            System.out.println("3");
//            System.out.println(ex.getStackTrace());
//        }
//

//        String a = "hello";
//        String b = new String("hello");
//        System.out.println(a == b);
//        System.out.println(a.equals(b));

//        String i = "I";
//        int k = Integer.parseInt(i);
//        System.out.println(k);

//        String str1 = "Selenium Class";
//        System.out.println(str1.length());
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please type  a random string");
//        String str2 = scanner.nextLine();
//
//        //Write a loop
//        //if someone types quit, loop should terminte
//        //else
//        //we give options:
//        //option 1 --> print length
//        //option 2 --> check if 'A' or 'a' exist in string
//        //option 3 --> cut a substring from 0 to 10 only if length is more than 10
//
//        while (!str2.equals("quit")){
//            System.out.println(str2);
//            System.out.println("Type 1 to check length");
//            System.out.println("Type 2 to check A or a");
//            System.out.println("Type 3 for substring");
//            System.out.println("Type - 'quit' to terminate");
//
//            str2 = scanner.nextLine();
//
//            switch(str2){
//                case "1": {
//                    System.out.println(str2.length());
//                }break;
//
//                case "2": {
//                    if (str2.indexOf("A") > 0 || str2.indexOf("a") > 0){
//                        System.out.println("A or a is in string");
//                    }
//                }break;
//
//                case "3": {
//                    if (str2.length() > 10){
//                        System.out.println(str2.substring(0, 9));
//                    }
//                }break;
//            }
//        }

//        String str3 = "hello";
//        char[] charArray = str3.toCharArray();
//        //String newString = charArray.toString().valueOf(charArray);
//        //System.out.println(newString);
//
//
//        char[] anotherArray = new char[str3.length()];
//
//        for (int t = 0 ; t < charArray.length; t++) {
//            anotherArray[t] = charArray[charArray.length -1 -t];
//
//        }
//        System.out.println(anotherArray);
//        String ola = new String(charArray);
//        System.out.println(ola);
//
//        StringBuilder build = new StringBuilder(ola);
//        System.out.println(build.reverse());


    }


}