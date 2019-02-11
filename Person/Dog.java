
/**
 * Write a description of class Dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dog implements Personable
{
   private double weight;
   private int age;
   
   public Dog(double w,int a)
   {
     weight = w;
     age = a;
   }

   public String toString()
   {
     String string = "";
     string = "This dogs weight is: "+weight+"  Aged: "+age ;
     return string;
    }
}
