import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // Task 1: Regex validate PIN code

        System.out.println("Task 1: Regex validate PIN code");
        System.out.println("Введите строку");
        String s = sc.next();
        System.out.println("Строка является пин-кодом");
        System.out.println(Pin.validatePin(s)) ;
        System.out.println();

        // Task 2: How good are you really?

        System.out.println("Введите ваш балл за тест (целое число)");
        int res = sc.nextInt();
        System.out.println("Введите массив целых чисел, разделяя числа пробелами (результаты ваших одноклассников)");
        String[] str = sc.next().split(" ");
        int[] r = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            r[i] = Integer.parseInt(str[i]);
        }
        System.out.println("Ваш результат выше среднего?");
        System.out.println(Test.betterThanAverage(r, res));
        System.out.println();

        // Task 3: How good are you really?

        System.out.println("Task 3: How good are you really?");
        System.out.println("Введите натуральное число n");
        Scanner sc1 = new Scanner(System.in);
        int size = sc1.nextInt();
        System.out.println("Последовательность из n чередующихся 1 и 0");
        System.out.println(StringyStrings.stringy(size));
        System.out.println();
    }


    // Task 1: Regex validate PIN code

    public static class Pin
    {
        public static boolean validatePin(String pin)
        {
            try
            {
                int intValue = Integer.parseInt(pin);
                if (pin.length() == 4 || pin.length() == 6) return true;
                else return false;
            }
            catch (NumberFormatException e)
            {
                return false;
            }
        }
    }

    // Task 2: How good are you really?
    public static class Test
    {
        public static boolean betterThanAverage(int[] classPoints, int yourPoints)
        {
            int sum = 0;
            for (int i =0; i< classPoints.length;i++) sum += classPoints[i];
            sum = sum/classPoints.length;
            return (yourPoints > sum);
        }
    }

    // Task 3: How good are you really?

    public static class StringyStrings
    {
        public static String stringy(int size)
        {
            String s = "";
            for (int i=1; i<=size/2; i++)
            {
                s += "10";
            }
            if (size % 2 == 1) s+="1";
            return s;
        }
    }

}

