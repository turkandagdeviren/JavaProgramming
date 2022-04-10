package day34_GarbageCollection_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //burada privateDataya farkli bir class oldugu icin ulasamiyorum ama ayni package oldugu icin public ve default a ulasabiliyorum
        //farkli bir package da olsaydi defaulta erisemezdim

        AccessModifiers.method1();
        AccessModifiers.method2();
       // AccessModifiers.method3(); private method is not visible outside the class

    }
}
