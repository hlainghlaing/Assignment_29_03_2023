package scm.com.arithmetics;

public class Calculator {
    
    private static byte addNum1;
    private static byte addNum2;
    private static float divNum1;
    private static float divNum2;
    private static float result;
    
    public static void main(String[] args) {
        add();
        sub(3,3);
        mul(5,6);
        div();
    }

    public static void add() {
        addNum1=3;
        addNum2=5;
        System.out.println(addNum1+addNum2);
    }
    

    public static void sub(int subNum1,int subNum2) {
      int result= subNum1-subNum2;
      System.out.println("Subtraction result : "+result);
      if(result==0) {
          System.out.println("Number1 & Number2 are equal");
      } else if(result>0){
          System.out.println("Number1 is greater than Number2");
      }else {
          System.out.println("Number1 is less than Number2");
      }
    }
    
    public static void mul(int mulNum1,int mulNum2) {
        System.out.print("Result of Multiplication two numbers :");
        System.out.println("\t"+mulNum1*mulNum2);
        
    }
    
    public static void div() {
        divNum1=5.66f;
        divNum2=2.0f;
        result=divNum1/divNum2;
        System.out.println(result);
    }
}
