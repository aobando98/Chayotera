package tree;

import logic.*;
import java.util.ArrayList;

import logic.Generic_Node;

public class Tree {
	
	private final int _MAX = random();
	private static Tree instance = new Tree();
	private ArrayList<Generic_Node> _Nodes;
	private Generic_Node<Branch> _Raiz;
	
	/**
	 * Constructor
	 */
	private Tree() {
		this._Nodes = new ArrayList<Generic_Node>();
		Branch pRaiz = new Branch();
		this._Raiz = new Generic_Node<Branch>(pRaiz);
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
	
	
	public Generic_Node<Branch> get_Raiz() {
		return _Raiz;
	}


	public void set_Raiz(Generic_Node<Branch> _Raiz) {
		this._Raiz = _Raiz;
	}
	
	public int get_MAX(){
		return _MAX;
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
	
	
	public void addNode(Generic_Node pNode){
		if (_Raiz.get_Nodes().size() < _MAX){
			_Raiz.get_Nodes().add(pNode);
			System.out.println("Se agrego el nodo");
		}else{
			System.out.println("Arbol lleno");
		}
	}
	
	
	public void search(Generic_Node pRaiz){
		
		if (pRaiz.get_Nodes().size() == 0){
			System.out.println(pRaiz.get_Data().getClass());
			
		}else if (pRaiz.get_Nodes().size() > 0){
			search((Generic_Node) pRaiz.get_Nodes().get(0));
			
			//si el padre es alguno de los hijos 
			for (int index = 1; index < pRaiz.get_Nodes().size(); index++){
				search((Generic_Node) pRaiz.get_Nodes().get(index));
			}
		}
	}

}
