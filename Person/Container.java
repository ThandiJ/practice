
/**
 * Write a description of class Container here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Container <A,B,C> implements Personable
{
   private A person1;
   private B dog;
   private C person2;
   
   public Container(A a,B b , C c)
   {
     person1 = a;
     dog = b;
     person2 = c;
   }
   public String toString()
   {
     String output ="";
      output = output+"Person 1: "+person1.toString()+"\n"+"Dog: "+dog.toString()+"\n"+"Person 2: "+person2.toString();
      return output;
   }
}
