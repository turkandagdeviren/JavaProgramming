package day14_String;

public class Domain {
    public static void main(String[] args) {

        /*
        1. Write a program that can get the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail
         */
        String email= "Cydeo.School@gmail.com";
        //domain:

        int beginningIndex= email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring (beginningIndex, endingIndex);
        System.out.println(domain);

        String str1 = "Java is fun, Java is cool, I love Java";

        int beg= str1.indexOf(" J")+1;
        int fin= str1.lastIndexOf(",");
        String s1= str1.substring(0, 10+1); //Java is fun
        System.out.println(s1);

        String s2= str1.substring(beg, fin);//Java is cool
        System.out.println(s2);

        String s3= str1.substring (str1.lastIndexOf("I"));
        System.out.println(s3);
    }
}
