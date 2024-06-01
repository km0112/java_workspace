//implements a geometric, planar square class
//keyword extends means that square is a subclass of rectangle
public class Square extends Rectangle
{
  // since the Rectangle class has length, width, and center and they are adequate for a square, no new fields needed

  //constructors: they initialize instance fields
  //as long as rectangle class has a default constructor, you don't need to write another one but constructors NEVER inherited
  //but once you create any constructor for this class, you can't use default constructor from Rectangle anymore

  public Square(double size, double x, double y)
  {
    //super keyword refers to superclass (Square's superclass is rectangle)
    //super has to be the first line of code so can't use both super and this in the same constructor
    super(size, size, x, y);
    //this looks for a constructor w that input pattern and initializes length and width to size
  }

  public Square()
  {
    super();
    //you can also call super(1,1,0,0)
    //you can also call default constructor of Rectangle class: super()
  }

  //methods

public double getSize()
  {
    return getWidth();
    //could also say return super.getWidth()
  }

public void setSize()
  {
    setWidth(size);
    //this works bc it uses overridden version from inside Square class
  }




@Override
public void setWidth(double W)
{
  super.setWidth(W);
  super.setLength(W);
}

@Override
public void setLength(double L)
{
  super.setWidth(L);
  super.setLength(L);
}

@Override
public String toString()
{
  String result = "Square of sidelength " + getWidth() + " centered at " + getCenter();
  //the super keyword calls the toString method from the Rectangle class
  result+= "\nwhich is also a " + super.toString();
  return result;
}


}
//you can call any public method from Rectangle class and Object class
