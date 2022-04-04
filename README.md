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
