

public class Rectangle
{
  //instance fields

  private double length, width;
  private Point center;

  //constructor

  //constructor that sets length to L, width to W and centers rectangle at (x,y)


public Rectangle(double L, double W, double x, double y)
  {
    //you don't need to use this because variable name is different from instance field
    length = L;
    width = W;
    center = new Point(x,y);

  }

public Rectangle()
  {
    //looks for a constructor with this input pattern so L=1, W=1, center = (0,0)
    this(1,1,0,0);
  }

//creates a rectangle of length L, width W, centered at Point P
public Rectangle(double L, double W, Point p)
{
  this(L,W, p.getX(), p.getY());
}

//creates a rectangle of length L, width W, centered at the origin
public Rectangle(double L, double W)
{
  this(L,W,0,0);
}

//methods

//getters
//returns the width of this Rectangle
public double getWidth()
{
  return width;
}

public double getLength()
{
  return length;
}

public Point getCenter()
{
  return center;
}

//returns the area of this rectangle
public double area()
{
  return length * width;
}

public double perimeter()
{
  return 2*length + 2*width;
}

//sets the length of this rectangle to newL
//precondition: newL>=0
public void setLength(double newL)
{
  length = newL;
}

//sets the width of this rectangle to newW
//precondition: newW>=0
public void setWidth(double newW)
{
  width = newW;
}

//moves this Rectangle's center to x,y
public void moveTo(double x, double y)
{
  //this moveTo is the moveTo method in the point class
  //polymorphism: object oriented programing concept where what the method does
  //depends on the kind of object that makes a call to the method
  center.moveTo(x,y);
}

//tells you if a rectangle is contained within another rectangle. returns true if rectangle that calls method
//contains rectangle other. Do this for hw and attempt intersects and distance

//This works for:
//when rectangle contains other
//when rectangle does not contain other
//Does not work for:
//when two rectangles have same dimensions and same center
public boolean contains(Rectangle other)
{
  //find centers of rectangles
  //if rectangles have same length and width and centers are in same place, return true
  if(other.getLength() == length && other.getWidth() == width)
  {
    //this statement isn't working, the statement it is inside of is working
    if(other.getCenter().getX() == center.getX() && other.getCenter().getY() == center.getY())
    {
      return true;
    }
    return false;

  }
  //if other has a greater area than rectangle, return false
  if(other.area() > length*width)
  {
    return false;
  }
  //else, check if rectangle center x coord+ L/2 >= other center x coord +L/2
  if(center.getX() + length/2 >= other.getCenter().getX() + other.getLength()/2)
  {
    //if yes, check if rectangle center x coord - L/2 <= other center x coord -L/2
    if(center.getX() - length/2 <= other.getCenter().getX() - other.getLength()/2)
    {
      //if yes, check if rectangle y coord + W/2 >= other center y coord +W/2
      if(center.getY() + width/2 >= other.getCenter().getY() + other.getWidth()/2)
      {
        //if yes, check if rectangle y coord -W/2 <= other center y coord - W/2
        if(center.getY() - width/2 <= other.getCenter().getY() - other.getWidth()/2)
        {
          //if yes, return true
          return true;
        }
        return false;
      }
      return false;
     }
    return false;
  }

  return false;
//if you encounter no at any stage, return false


}

//tells you if 2 rectangles intersect
/* public boolean intersects(Rectangle other)
{

}

//takes another rectangle as input and returns the distance between 2 rectangles
//distance is zero if rectangles intersect or one rectangle contains another
public double distance(Rectangle other)
{

}
*/
@Override
public String toString()
  {
    String result = length + " by " + width;
    result += " rectangle centered at " + center;
    return result;
  }



}
