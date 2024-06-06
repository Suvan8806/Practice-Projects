package monster;

public class Skeleton implements Monster {
	private String name;
	private int size;
	
	public Skeleton() {
		name = "";
		size = 0;
	}
	
	public Skeleton(String n, int s) {
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
