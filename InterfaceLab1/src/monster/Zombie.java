package monster;

public class Zombie implements Monster {
	private String name;
	private int size;
	
	public Zombie() {
		name = "";
		size = 0;
	}
	
	public Zombie(String n, int s) {
		this.name = n;
		this.size = s;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}


	@Override
	public boolean isBigger(Monster other) {
		return getSize()> other.getSize();
	}

	@Override
	public boolean sameName(Monster other) {
		return getName().equals(other.getName());
	}
	
	public String toString() {
		return name + " " + size;
	}

}
