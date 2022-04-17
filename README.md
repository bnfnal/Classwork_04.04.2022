# Classwork_04.04.2022

## **Task 1: Regex validate PIN code**

### **Class:** 
                Pin
### **Function:**   
                validatePin(String pin)

### **Task:**

ATM machines allow 4 or 6 digit PIN codes and PIN codes 
cannot contain anything but exactly 4 digits or exactly 6 digits.
If the function is passed a valid PIN string, return true, else return false.

### **Examples:**

     "1234"   -->  true
     "12345"  -->  false
     "a234"   -->  false


### **Favorite solution:**


      public class Solution 
      {
          public static boolean validatePin(String pin) 
          {
               return pin.matches("[0-9]{4}|[0-9]{6}");
          }
      }
      
      

## **Task 2: How good are you really?**

### **Class:** 
                Test
### **Function:**   
                betterThanAverage(int[] classPoints, int yourPoints)

### **Task:**
There was a test in your class and you passed it. Congratulations!
But you're an ambitious person. You want to know if you're better than the average student in your class.

You receive an array with your peers' test scores. Now calculate the average and compare your score!

Return True if you're better, else False!

Note:
Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!

### **Favorite solution:**


      public class Kata 
      {
        public static boolean betterThanAverage(int[] classPoints, int yourPoints) 
        {
          int sum = 0;
          for (int val : classPoints) 
          {
             sum += val;
          }
          return yourPoints > (sum / classPoints.length);
        }
    }


