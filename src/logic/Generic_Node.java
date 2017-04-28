package logic;

import java.util.*;

public class Generic_Node<T> {
	
	private final int _MAX = 6;
	private T _Data;
	private ArrayList<Generic_Node<T>> _Nodes = new ArrayList<Generic_Node<T>>();
	
	//Constructor
	
	public Generic_Node(T pData){
		this._Data = pData;
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
	
}
