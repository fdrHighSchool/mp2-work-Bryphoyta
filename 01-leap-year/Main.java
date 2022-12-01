class Main {
  public static void main(String[] args) {
    System.out.println (leapYear(1900));
  }

  public static boolean leapYear(int year){
   boolean leap = false;
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0){
          leap = true;
        }else{
          leap = false;
        }
      }else{
        leap = true;
      }
    }else{
      leap = false;
    }
  
  return leap; 

  }
}
