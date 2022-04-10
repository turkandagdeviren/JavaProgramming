package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str="123";
        int num= Integer.parseInt(str); //int/ parseInt methoduyla Stringi inte cevirdik
        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2= "10.5";
        double num2= Double.parseDouble(str2); //convert the String to the double
        System.out.println(num2+1); //11.5

        int max= Integer.MAX_VALUE; //it gives the max / min value of that primitive type ( here integer)
        int min=Integer.MIN_VALUE;

        System.out.println("max value of int primitive: "+max);
        System.out.println("min value of long primitive: "+ min);

       long max2= Long.MAX_VALUE;
       long min2= Long.MIN_VALUE;
        System.out.println("max value of long primitive: " +max2);
        System.out.println("min value of long primitive: "+ min2);

        String s1= "maybe";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println(r1); //convert the String to the boolean by using parse method//it will print false whatever we write except true

        System.out.println("--------------------------------");
        String s2= "123";
        Integer x= Integer.valueOf(s2); //Integer ==> wrapper class
        int y= Integer.valueOf(s2); //=> unboxing ==> primitive value
        System.out.println(x);
        System.out.println(y);

        String s3= "1.5";
        Double z= Double.valueOf(s3); //Double
        System.out.println(z);
        System.out.println("--------------------------------");

        //isDigit()
        char ch1= '!';
        System.out.println(ch1);
        boolean r2= Character.isDigit(ch1);
        System.out.println(r2);

        char ch2= 'A';
        boolean r3= Character.isLetter(ch2);
        System.out.println(r3);

        boolean r4= !Character.isLetterOrDigit(ch1); //true cikarsa demek ki special character
        System.out.println(r4);

        //upperCase
        boolean r5= Character.isUpperCase(ch1);

        //lowerCase
        boolean r6= Character.isUpperCase(ch1);
        System.out.println("--------------------------------");

        String s = "ab1cde2efg3hi4";
        int sum= 0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+ each);
            }
        }
        System.out.println("sum = "+ sum);

    }
}
