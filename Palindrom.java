public class Palindrom {
    
    public boolean isPalindrom(String input){
        if(input.length()==0||input.length()==1){
            return true;
        }
        else{
            if(input.charAt(0)==input.charAt(input.length()-1)){
               return isPalindrom(input.substring(1, input.length()-1));
        }
    }
        return false;
    }
    public static void main(String[] args) {
        Palindrom pa=new Palindrom();
      System.out.println(pa.isPalindrom("raecar"));

    }
}
