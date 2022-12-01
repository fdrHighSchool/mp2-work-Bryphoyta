class Main {
  public static void main(String[] args) {
    System.out.println(firstHalf("WooHoo"));
    System.out.println(conCat("abc","cat"));
  }
  public static String firstHalf(String word1){
    String result = "";
    if (word1.length() % 2 == 0){
      result = word1.substring(0,word1.length()/2);
      return result;
    }
    else{
      return result;
    }
  }

  public static String conCat(String word3, String word4){
    String result1 = "";
    if (word3.substring(word3.length()).equals(word4.substring(0,1))){
      String string1 = word3.substring(0,word3.length()-1);
      String string2 = word4.substring(1,word4.length()-1);
      result1 += string1 += string2;
    }
    else{
      String string3 = word3.substring(0,word3.length());
      String string4 = word4.substring(0,word4.length());
      result1 += string3 += string4;
    }
    return result1;
  }
}
