package club.ensoul.learn.design.pattern.factory.abstracts;

public class Green implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}