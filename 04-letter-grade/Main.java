class Main {
  public static void main(String[] args) {
    letterGrade(80);
  }

  public static void letterGrade(int a){
    String grade = "";
    int b = a %10;
    int c = a / 100;

    if (a>=90) {
      grade += ("A");
    }
    else if (80 <= a && a <= 90) {
      grade += ("B");
    }
    else if (70 <= a && a <= 80) {
      grade += ("C");
    }
    else if (60 <= a && a <= 70) {
      grade += ("D");
    }
    else{
      grade += ("F");
    }

    if ((b >= 7 || c == 1) && (a > 60)) {
      grade += "+";
    }
    else if (b <= 2 && a >60){
      grade += "-";
    }
    System.out.print("Your letter grade has been evaluted to " +grade);
  }
}
