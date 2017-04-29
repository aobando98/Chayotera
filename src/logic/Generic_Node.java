package logic;

import java.util.*;

import tree.Tree;

public class Generic_Node<T> extends Thread{
	
	private int _MAX = random();
	private static int _Objective = 15;
	private static int _Chayotes;
	private static double _Chance;
	private T _Data;
	private ArrayList<Generic_Node> _Nodes = new ArrayList<Generic_Node>();
	
	
	public T get_Data() {
		return _Data;
	}

	public void set_Data(T _Data) {
		this._Data = _Data;
	}

	public ArrayList<Generic_Node> get_Nodes() {
		return _Nodes;
	}

	public void set_Nodes(ArrayList<Generic_Node> _Nodes) {
		this._Nodes = _Nodes;
	}
	
	//Constructor

	public Generic_Node(T pData){
		this._Data = pData;
		run();
	}
	
	public void Add_Node(Generic_Node<T> pNode){
		if (_Data.getClass() == Branch.class){
			
			if (this._Nodes.size() < _MAX){
				this._Nodes.add(pNode);
			}else{
				System.out.println("Arbol lleno.");
			}
		}else{
			System.out.println("No es permitido agregar mas nodos.");
		}
	}
	
	
	//***************************************************************************************
	@Override
	public void run(){
		if (_Nodes.size() < _MAX){
			//_Tree = Tree.getInstance();
			if (result()){
				Chayote Chayo = new Chayote();
				Generic_Node<Chayote> Node = new Generic_Node<Chayote>(Chayo);
				_Nodes.add(Node);
				_Chayotes++;
			}else{
				Branch NewProduction = new Branch();
				Generic_Node<Branch> Node = new Generic_Node<Branch>(NewProduction);
				_Nodes.add(Node);
				run(); //vuelve a correr el hilo ya que puede seguir creciendo
			}
			
		}
	}
	/***************************************************************************************
	
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
	
	/**
	 * Genera un numero random entre 2 y 6 para saber cuantos hijos tendra el arbol
	 * @return un numero random entre 2 y 6
	 */
	public int random(){
		int result = 0;
		
		result = 2 + (int)(Math.random() * ((6 - 2) + 1));
		
		return result;
	}

	
}
