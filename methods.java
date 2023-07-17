import java.util.*;
class methods
{
    public float multiply(int num1,float num2)
    {
       float result=num1*num2;
       return result;
    }
    public static void main(String[] args) {
        methods m=new methodsobject.java();
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        float num2=sc.nextFloat();
    //    System.out.println("the result is "+m.multiply(num1,num2));
    float resultOfMultiply=m.multiply(num1,num2);
    System.out.println("the result is "+resultOfMultiply);

    }
}