class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(25));
  }

  public static boolean divBy3(int a) {
    int b = 0;
    int r = 0;
     do {
       r = a % 10;
       b += r;
       a = a / 10;
     }
      while (a>0);

    return b % 3 == 0;
  }
}
