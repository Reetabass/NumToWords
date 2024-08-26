public class NumberToWords {

    public static String intToWords(int num) {
		//Write your code here 
      
     int firstDigit = num / 100;
     int secondDigit = (num % 100) / 10;
     int thirdDigit = num % 10;
     
      
      String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
      String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
      String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
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

    public static String intToRoman(int num) {
      //Write your code here 

      int firstDigit = num / 100;
      int secondDigit = (num % 100) / 10;
      int thirdDigit = num % 10;

      String[] ones = {"", "I" , "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String[] hundered = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

      if (num < 0 || num > 999) {
        return "Invalid number";
      }

      if (num == 0) {
        return "Zero";
      }

      if (num < 10 && num > 0) {
        return ones[num];
      }

      if (num < 100 && num > 10) {
        if (thirdDigit == 0) {
          return tens[secondDigit];
        } else {
          return tens[secondDigit] + ones[thirdDigit];
        }
      }

      if (num < 1000 && num > 100) {
        if (secondDigit == 0 && thirdDigit == 0) {
          return hundered[firstDigit];
        } else if (secondDigit == 0) {
          return hundered[firstDigit] + tens[secondDigit];
        } else if (thirdDigit == 0) {
          return hundered[firstDigit] + tens[secondDigit];
        } else {
          return hundered[firstDigit] + tens[secondDigit] + ones[thirdDigit];
        }
      }

      else {
        return "Invalid number";
      }

    }

    public static void main(String[] args) {
		//Write your code here 
    int numInput = getInput();
    
    while(numInput != -1) {
        System.out.println("In words : " + intToWords(numInput));
        System.out.println("In Roman : " + intToRoman(numInput));
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

  /*public static String invalidInput () {
    return "Invalid number";
  }*/
}
