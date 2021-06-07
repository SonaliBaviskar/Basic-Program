import java.util.*;
class character{ 
public static void main (String[] args) {
    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter sentence");
      String SN = sc.nextLine();
      for(int i=0;i<SN.length();i++)
      {
          char c = SN.charAt(i);
          System.out.println("char at "+ i+" "+c);
      }
      System.out.println("enter a digit:");
      int S = sc.nextInt();
     
      char D = SN.charAt(S);
      System.out.println("the char is: "+D);
      
}
}