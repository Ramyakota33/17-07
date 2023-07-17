class Student
  {
    int rollno;
    String name;
    public static void main(String args[])
    {
      Student student=new Student();
      Student student1=new Student();
      student.rollno=123;
      student.name="ramya";
      System.out.println("rollno is "+student.rollno);
      System.out.println("name is "+student.name);
      student1.rollno=124;
      student1.name="shannu";
      System.out.println("roll no is "+student1.rollno);
      System.out.println("name is "+student1.name);
    }

  }