import test.EnumClass;

public class ImportEnum {
    public static void main(String args[]){
        EnumClass test = new EnumClass();
        test.sizes = EnumClass.DressSize.SMALL;
        System.out.println(test.sizes);
    }
}