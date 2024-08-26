public class NumberToWords {

    public static String intToWords(int num) {
		//Write your code here 
      
     int firstDigit = num / 100;
     int secondDigit = (num % 100) / 10;
     int thirdDigit = num % 10;
     
      
      String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}; 
      String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
      String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
      String[] hundered = {" hundered ", " hundred and "};
      
      if (num < 0 || num > 999) {
        return "Invalid number";
      }

      if (num == 0) {
        return "Zero";
      }

      if (num < 10) {
        return ones[num];
      }

      if (num < 20 && num > 10) {
        return teens[num - 10];
      }

      if ( num < 100) {
        if (thirdDigit == 0) {
          return tens[secondDigit];
        } else {
          return tens[secondDigit] + " " + ones[thirdDigit];
        }
      }

      if (num < 1000) {
        if (secondDigit == 0 && thirdDigit == 0) {
          return ones[firstDigit] + hundered[0];
        } else if (secondDigit == 0) {
          return ones[firstDigit] + hundered[1] + ones[thirdDigit];
        } else if (secondDigit == 1) {
          return ones[firstDigit] + hundered[1] + teens[thirdDigit];
        } else if (thirdDigit == 0) {
          return ones[firstDigit] + hundered[1] + tens[secondDigit];
        } else {
          return ones[firstDigit] + hundered[1] + tens[secondDigit] + " " + ones[thirdDigit];
        }
      }

      else {
        return "Invalid number";
      }

    }

    /*public static String intToRoman(int num) {
       //Write your code here 
    } */

    public static void main(String[] args) {
		//Write your code here 
    
    int numInput = getInput();

    while(numInput != -1) {
        System.out.println("In words : " + intToWords(numInput));
        //System.out.println("In Roman : " + intToRoman(numInput));
        numInput = getInput();
    }

    if (numInput == -1) {
        System.out.println("Done");
    }



	}

  public static int getInput() {
    System.out.println("Number : ");
    int numInput = In.nextInt();
    return numInput;
  }
}
