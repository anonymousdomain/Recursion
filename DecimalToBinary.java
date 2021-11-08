public class DecimalToBinary {

  public static String findBinary(int decimal, String result) {

    if(decimal==0){
        return result;
    }
    return result=findBinary(decimal/2, result)+decimal%2;
  }

public static void main(String[] args) {
    System.out.println(DecimalToBinary.findBinary(233,""));
}
}
