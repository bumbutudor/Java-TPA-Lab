public class CharToStringDemo
{
   public static void main(String args[])
   {
      // Methoda 1: Folosind metoda toString() 
      char ch = 'a';
      String str;
	  str = Character.toString(ch);
      System.out.println("Stringul este: "+str);
 
      // Methoda 2: Folosind metoda valueOf()
      String str2 = String.valueOf(ch);
      System.out.println("String is: "+str2);
   }
}