

public class Player2 extends Player1{
private int health;
private boolean armour;
	public Player2(String name, int health, String weapon,boolean armour) {
		
	 super(name, health, weapon);
	  
	 
	 this.armour=armour;	
	 if(health<=0|| health>100)
		 this.health = 100;
	else
		this.health = health;
	}

	public void hitByGun1()
	{
		if(armour)
		{
		health-=20;
		if(health<=0)
		{
			health=0;
		}
		System.out.println(this.getName()+ "Got it by Gun1.Health is reduced by 20 "+"Now health is "+health);
		if(health==0)
			System.out.println(this.getName()+" is dead.....");
		}
		else
			super.hitByGun1();
	}
	
	public void hitByGun2()
	{
		if(armour)
		{
		health-=30;
		if(health<=0)
		{
			health=0;
		}
		System.out.println(this.getName()+" Got it by Gun2.Health is reduced by 30 "+"Now health is "+health);
		if(health==0)
			System.out.println(this.getName()+" is dead.....");
		}
		else
			super.hitByGun2();
	}
 

}
