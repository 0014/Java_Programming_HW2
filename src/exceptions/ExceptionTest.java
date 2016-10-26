package exceptions;

/**
 * Created by FreakingM on 10/22/2016.
 */
public class ExceptionTest {
    public static void main(String[]args)
      
    {
       try{
         throw new ExceptionB();
       }catch(ExceptionA exceptionA){
           System.err.println(exceptionA);
           System.out.println("ExceptionB caught by exceptionA");
       }
      try{
           throw new ExceptionC();
       }catch (ExceptionA exceptionA){
          System.err.println(exceptionA);
          System.out.println("ExceptionC caught by exceptionA");
      }
    }
}
