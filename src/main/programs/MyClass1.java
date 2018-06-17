package main.programs;

public class MyClass1 {
    final static synchronized strictfp public void main(String... args){
        System.out.println("Valid main modifiers: final static synchronized strictfp public");

    }

    public static void main(int[] args){
        System.out.println("this won't be called by JVM because of the args type");
    }
}
