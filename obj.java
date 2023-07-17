class Student
  {
    int rollno;
    String name;
    public void display()
    {
       System.out.println("rollno is "+rollno);
      System.out.println("name is "+name);
    }
    public static void main(String args[])
    {
      Student student=new Student();
     // Student student1=new Student();
      student.rollno=123;
      student.name="John";
     student.display();
      }
  }