//implements a point in the plane

public class Point
{
//instance fields
  private double x, y;

//constructors
  public Point(double x, double y)
  {
//full name of instance field x
//this reference is a reference of an object to itself
    this.x = x;
    this.y = y;
  }

  public Point()
  {}

//methods
public double getX()
{ return x; }

public double getY()
{ return y; }

public void moveTo(double newx, double newy)
{
  x = newx;
  y = newy;
}

public double distanceFrom(Point other)
{
  double dx = x - other.x;
  double dy = y - other.y;
  return Math.sqrt( dx*dx + dy*dy );
}

  @Override
  public String toString()
    {
      return "(" + x + "," + y + ")";
    }

}
