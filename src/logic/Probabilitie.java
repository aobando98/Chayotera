package logic;

public class Probabilitie {
	
	private double _Chance;
	
	//Constructor
	public Probabilitie(double pChance){
		this._Chance = pChance;
	}
	
	//Functions
	
	public boolean result(){
		boolean result = false;
		
		double random = (Math.random() * ((100 - 0) + 1));
		
		if (random <= _Chance){
			result = true;
		}
		
		return result;
	}
	

}
