package monster;

public interface Monster {
	public String getName();
	public int getSize();
	public boolean isBigger(Monster other);
	public boolean sameName(Monster other);
	
}
