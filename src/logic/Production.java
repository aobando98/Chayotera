package logic;

import java.util.*;

public class Production implements Runnable {
	
	private static int _Chayotes = 0;
	private static int _Objective;
	private static double _Chance;
	private Tree _Tree = null;
	
	//Constructor
	public Production(double pChance, int pObjective){
		this._Objective = pObjective;
		this._Chance = pChance;
	}
	
	//Functionss
	@Override
	public void run(){
		while (_Chayotes < _Objective){
			
		}
	}

}
