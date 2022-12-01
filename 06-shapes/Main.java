class Main {
  public static void main(String[] args) {
    System.out.println("Shapes!");

    // TEST CASES:
    square(1);
    System.out.println();
    square(4);
    System.out.println(); 

    rectangle(2, 4);
    System.out.println();
    rectangle(4, 2);
    System.out.println();

    triangle(2);
    System.out.println();
    triangle(4);
    System.out.println();
  } // end main method

  public static void square(int s) {
    for (int row = 0; row < s; row++) {
      for (int col = 0; col < s; col++) {
        System.out.print("* ");
      } // end col for loop
      System.out.println();
    } // end row for loop
  } // end square method


  public static void rectangle(int l, int w) {
    for (int row = 0; row < w; row++){
      for (int col = 0; col < l; col++){
        System.out.print("* ");
      }
      System.out.println();
    }
  } // end rectangle method

  public static void triangle(int N){
    for (int r = 1; r <= N; r++) {
        for (int j = 1; j <= r; j++) {
        System.out.print("* ");
        }
      System.out.println();
    }
  }//end triangle method

} // end class
