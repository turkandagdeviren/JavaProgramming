package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str= "Java is fun, I love learning Java";
        String str2= str.replace("Java", "Pyhton");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email ="JohnSmith@yahoo.com";
        email= email.replace("yahoo", "gmail"); // bu sekilde yeniden assign etmezsek yahoo olarak yazdirmaya devam eder
        System.out.println("email = " + email);
        
        String sentence ="Java Java Python Python C# C# Python Python Python Python";
        String sentence2= sentence.replace("Python ", "").replace("Python" , "");

        System.out.println("sentence2 = " + sentence2);
        String s ="Dog Dog Dog Dog Dog Dog";
        s= s.replace ("Dog", "Cat"); //"Cat ..."
        System.out.println("s = " + s);
        String s2= "C# is fun, C# is cool";
        s2= s2.replace(" C#", " Java"); //sadece ikinci C# i degistirmek icin bosluklari da ekleyerek spesific yapariz
        System.out.println("s2 = " + s2);
        
        String s3= "Java";
        
        s3= s3.replace("a", "e");
        System.out.println("s3 = " + s3);

        System.out.println("-------------------------------");
        
        String result ="Java Java Java";
        //result = result.replace ("Java","Python"); // her bir javayi pythonla degistirir
        result = result.replaceFirst("Java", "Python"); //sadece 1.yi degistirir
        System.out.println("result = " + result);
        
        String result2= "C# is fun, C# is cool";
        result2= result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);
        
        String result3= "Java";
        result3= result3.replaceFirst("a","o");
        System.out.println("result3 = " + result3);









    }
}
