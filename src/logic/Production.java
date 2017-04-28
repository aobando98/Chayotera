package logic;


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
		if (_Chayotes < _Objective){
			_Tree = Tree.getInstance();
			if (result()){
				Chayote Chayo = new Chayote();
				Generic_Node<Chayote> Node = new Generic_Node<Chayote>(Chayo);
				_Tree.get_Nodes().add(Node);
				_Chayotes++;
			}else{
				Branch NewProduction = new Branch();
				Generic_Node<Branch> Node = new Generic_Node<Branch>(NewProduction);
				_Tree.get_Nodes().add(Node);
				run(); //vuelve a correr el hilo ya que puede seguir creciendo
			}
			
		}
	}
	
	public boolean result(){
		boolean result = false;
		
		double random = 0 + (Math.random() * ((100 - 0) + 1));
		
		if (random <= _Chance){
			result = true;
		}
		
		return result;
	}

}
