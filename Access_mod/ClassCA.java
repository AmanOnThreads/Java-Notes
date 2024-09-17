import com.example.ClassA;

public class ClassCA extends ClassA {
    public static void main(String[] args) {
        ClassCA cx = new ClassCA();
        // System.out.println("defaultNumber "+cx.defaultNumber);
        System.out.println("protectedNumber "+cx.protectedNumber);
        System.out.println("publicNumber "+cx.publicNumber);


        // ClassA caa = new ClassA();
        // System.out.println("protectedNumber "+caa.protectedNumber);
        /*
          protected members are meant to be accessed within the subclass,
          not from the parent class directly if they are in different packages.
        */

    }
}
