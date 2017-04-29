package logic;

import tree.Tree;

public class Production extends Thread{
	
	private static int _Chayotes = 0;
	private static int _Objective;
	private static double _Chance;
	private Tree _Tree;
	
	//Constructor
	/**
	 * 
	 * @param pChance Probabilidad de que nazca un cogollo
	 * @param pObjective cantidad de chayotes por conseguir
	 * @param pArbol es el arbol sobre el que se va a trabajar
	 */
	public Production(double pChance, int pObjective, Tree pArbol){
		this._Objective = pObjective;
		this._Chance = pChance;
		this._Tree = pArbol;
	}
	
	//Functionss
	@Override
	public void run(){
		while (_Chayotes < _Objective){
			_Tree = Tree.getInstance();
			if (result()){
				Chayote Chayo = new Chayote();
				Generic_Node<Chayote> Node = new Generic_Node<Chayote>(Chayo);
				_Tree.get_Nodes().add(Node);
				_Chayotes++;
				this.stop();
			}else{
				Branch NewProduction = new Branch();
				Generic_Node<Branch> Node = new Generic_Node<Branch>(NewProduction);
				_Tree.get_Nodes().add(Node);
				run();
			}
		}
	}
	
	/**
	 * Se usa para saber si se debe crear un chayote o una rama
	 * @return valor booleano
	 */
	public boolean result(){
		boolean result = false;
		
		double random = 0 + (Math.random() * ((100 - 0) + 1));
		
		if (random <= _Chance){
			result = true;
		}
		
		return result;
	}

}
