class emp
  {
    String name;
    int salary;
    String designation;
    public void display()
    {
      System.out.println("enter the name of emp"+name);
      System.out.println("enter the salary of emp"+salary);
      System.out.println("enter the designation of emp"+designation);
    }
    public static void main(String args[])
    {
      emp emp1=new emp();
      emp1.name="ramya";
       emp1.salary=10000;
       emp1.designation="intern";
      emp emp2=new emp();
      emp2.name="shannu";
       emp2.salary=10000;
       emp2.designation="intern";
      emp emp3=new emp();
      emp3.name="lucky";
       emp3.salary=70000;
       emp3.designation="manager";
      emp emp4=new emp();
      emp4.name="ram";
       emp4.salary=50000;
       emp4.designation="asstmng";
      emp1.display();
       emp2.display();
       emp3.display();
       emp4.display();
      }
      }
  