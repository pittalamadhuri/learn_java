package test;

public class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello World");
        EnumClass enumc = new EnumClass();
        enumc.sizes = EnumClass.DressSize.SMALL;
    }
}