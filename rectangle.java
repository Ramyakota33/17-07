import java.util.Scanner;
class rectangle
  {
      int width;
      int height;
      public void display()
      {
       System.out.println("perimeter of rectangle "+2*(height+width));
        System.out.println("area of rectangle "+(height*width));
      }
      public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      rectangle Rectangle=new rectangle();
      System.out.println("enter height");
      Rectangle.height=sc.nextInt();
      System.out.println("enter width");
      Rectangle.height=sc.nextInt();
      Rectangle.display();
     }
  }
      