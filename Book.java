//Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.
class Book
  {
    String bookname;
    String author;
    int year;
    public void  initializeBook(String b,String a,int y)
    {
      bookname=b;
      author=a;
      year=y;
    }
    public void display()
    {
      System.out.println("bookname is"+bookname);
      System.out.println("author is"+author);
      System.out.println("year is"+year);
    }
    public static void main(String args[])
    {
      Book b=new Book();
      b.initializeBook("java","james gosling",1995);
      b.display();
      
    }
    
    }
  
