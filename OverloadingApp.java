package gr.aueb.cf.ch4;

/**
 * overloading is when i use the same method
 * with different types of parameter
 */
public class OverloadingApp {

    public static void main(String[] args) {

    }




    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(long a, long b){       //i can define a new method with the same name,but with different parameters (different signature)
          return (int) (a+b) ;
    }

    public static int add(long a, int b){
        return (int) (a + b);
    }

    public static int add(int a, int b, int c){
        return a + b + c ;
    }
}
