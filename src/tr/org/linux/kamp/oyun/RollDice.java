package tr.org.linux.kamp.oyun;

public class RollDice {
	
	public static void main(String[] args) {
		FairDie die1= new FairDie();
		FairDie die2=new FairDie();
		
		System.out.println("Hadi Düses:"+die1.roll()+"-"+die2.roll());
		
		GamblersDie gdie1=new GamblersDie();
		GamblersDie gdie2=new GamblersDie();
		System.out.println("Gambler:"+gdie1.roll()+"-"+gdie2.roll());
	}

}
