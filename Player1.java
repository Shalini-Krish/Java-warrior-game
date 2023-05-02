public class Player1 {
private String name;
private int health;
private String weapon;



public Player1(String name, int health, String weapon) { 
	 
	this.name = name;
	this.weapon = weapon;
	if(health<=0|| health>100)
		 this.health = 100;
	else
		this.health = health;
	 
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public String getWeapon() {
	return weapon;
}
public void setWeapon(String weapon) {
	this.weapon = weapon;
}

public void hitByGun1()
{
	health-=30;//-10
	if(health<=0)
	{
		health=0;
	}
	System.out.println(this.getName()+" Got it by Gun1.Health is reduced by 30 "+"Now health is "+health);
	if(health==0)
		System.out.println(this.getName()+" is dead.....");
}

public void hitByGun2()
{
	health-=40;
	if(health<=0)
	{
		health=0;
	}
	System.out.println(this.getName()+ " Got it by Gun2.Health is reduced by 40 "+"Now health is "+health);
	if(health==0)
		System.out.println(getName()+" is dead.....");
}
}
