class Main {
  public static void main(String[] args) {
   System.out.println(countQuarters(30));
  }
  public static int countQuarters(int cent) {
    String first = "" + cent;
    int second = first.length();
    String fs = first.substring(second - 2);
    int ffs = Integer.parseInt(fs);
    return ffs/25;
  }
}
