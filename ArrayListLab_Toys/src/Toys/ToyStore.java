package Toys;

//Complete the class

import java.util.ArrayList;

public class ToyStore {
	private ArrayList<Toy> toyList;

	public ToyStore() {
  toyList= new ArrayList<Toy>();
	}

	public void loadToys( String[] toys )	{
  for (String name : toys) {
    Toy existingToy = getThatToy(name);
    if (existingToy == null) {
      toyList.add(new Toy(name));
    } else {
      existingToy.setCount(existingToy.getCount() + 1);
    }
  }
	}

public Toy getThatToy( String n )	{
  Toy toy = null;
  for (Toy t : toyList) {
    if (t.getName().equals(n)) {
      toy = t;
    }
  }
  return toy != null ? toy : new Toy(n);
}

public Toy getMostFrequentToy()	{
  if (toyList.isEmpty()) {
    return null;
  }

  Toy mostFrequent = toyList.get(0);
  for (Toy toy : toyList) {
    if (toy.getCount() > mostFrequent.getCount()) {
      mostFrequent = toy;
    }
  }
  return mostFrequent;
}  


public String toString() {
  return toyList.toString();
}
}