package logic;

import java.util.ArrayList;

public class Tree {
	
	private final int _MAX = random();
	private static Tree instance = null;
	private ArrayList<Generic_Node> _Nodes;
	
	/**
	 * Constructor
	 */
	private Tree() {
		// Exists only to defeat instantiation.
	}
	
	
	//Setters y Getters
	
	public ArrayList<Generic_Node> get_Nodes() {
		return _Nodes;
	}

	public void set_Nodes(ArrayList<Generic_Node> _Nodes) {
		this._Nodes = _Nodes;
	}

	public static void setInstance(Tree instance) {
		Tree.instance = instance;
	}
	
	public static Tree getInstance() {
		if(instance == null) {
			instance = new Tree();
		}
		return instance;
	}
	
	//Funciones
	
	public int random(){
		int result = 0;
		
		result = 2 + (int)(Math.random() * ((6 - 2) + 1));
		
		return result;
	}

}
