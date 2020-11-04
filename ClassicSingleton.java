class Singleton {
    private static Singleton instance = null;
    protected Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            return instance;
        } else {
            return instance;
        }
    }
}

public class ClassicSingleton {
    public static void main(String args[]){
        Singleton here = Singleton.getInstance();
        System.out.println("here is " +here);
    }
}

