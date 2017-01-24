
public class Characters
	{
	private String name;
	private int health;
	private String party;
	private String move1;
	private String move2;
	private String move3;
	private String move4;
	public Characters (String n, int h, String p, String m1, String m2, String m3, String m4)
		{
		name = n;
		health = h;
		party = p;
		move1 = m1;
		move2 = m2;
		move3 = m3;
		move4 = m4;
		}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public int getHealth()
		{
			return health;
		}
	public void setHealth(int health)
		{
			this.health = health;
		}
	public String getParty()
		{
			return party;
		}
	public void setParty(String party)
		{
			this.party = party;
		}
	public String getMove1()
		{
			return move1;
		}
	public void setMove1(String move1)
		{
			this.move1 = move1;
		}
	public String getMove2()
		{
			return move2;
		}
	public void setMove2(String move2)
		{
			this.move2 = move2;
		}
	public String getMove3()
		{
			return move3;
		}
	public void setMove3(String move3)
		{
			this.move3 = move3;
		}
	public String getMove4()
		{
			return move4;
		}
	public void setMove4(String move4)
		{
			this.move4 = move4;
		}
	
	}