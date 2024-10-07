package FirstRepo;
class Constr
{
    private double width;
    private double height;
    private double depth;

    public double default1()
    {
        this.width = 1.0;
        this.height = 1.0;
        this.depth = 1.0;
        
        return(height*width*depth);
    }
    public double default1(double width,double depth,double height)
    {
        this.width = width;
        this.height = height;
        this.depth= depth;

       return(height*width*depth);
    }
    public void display()
    {
        System.out.println("width = "+width);
        System.out.println("Height = "+height);
        System.out.println("Depth ="+depth);
        System.out.println();
       
    }
}
public class lab2 
{
    public static void main(String[] args) 
    {
      Constr obj = new Constr();
      System.out.println("Default constructor");
      obj.default1();
      obj.display();
      
      Constr obj1 = new Constr();
      System.out.println("Parameterized Constructor");
      obj1.default1(22,44,66);
      obj1.display();


    }
    

}

