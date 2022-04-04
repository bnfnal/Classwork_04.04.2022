import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Task 1: Regex validate PIN code

        System.out.println("Task 1: Regex validate PIN code");
        System.out.println("Введите строку");
        String s = sc.next();
        System.out.println("Строка является пин-кодом");
        System.out.println(Pin.validatePin(s)) ;
    }


    // Task 1: Regex validate PIN code

    public static class Pin
    {
      public static boolean validatePin(String pin) 
      {
         try 
         {
             int intValue = Integer.parseInt(pin);
             if( pin.length() == 4 || pin.length() == 6) return true;
             else return false;
         }
         catch (NumberFormatException e)
         {
            return false;
         }
     }
  }
}
