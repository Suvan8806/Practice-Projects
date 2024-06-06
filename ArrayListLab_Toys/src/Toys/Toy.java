package Toys;

//design and create
//your Toy class

//Use the instructions to help you determine necessary methods and data fields

import java.util.ArrayList;

public class Toy {
private String name;
private int count;

public Toy() {
  name = "";
  count = 0;
}

public Toy(String n) {
  name = n;
  count = 1;
}

public int getCount( )	{
  return count;
}

public void setCount( int c)	{
  count = c;
}

public String getName( )	{
  return name;
}

public void setName(String name)  {
  this.name = name;
}

public String toString() {
  return name + " " + count;
}

}