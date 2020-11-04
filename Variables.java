class TestVar {
    void printVariables(){
        int age = 1; //initialization is required
        System.out.println(age+1);
    }
}

public class Variables {
    public static void main(String args[]){
        TestVar test = new TestVar();
        test.printVariables();
    }
}
