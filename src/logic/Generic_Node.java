package logic;

import java.util.*;

public class Generic_Node<T> {
	
	private T _Data;
	private ArrayList<Generic_Node<T>> _Nodes;
	
	//Constructor
	
	public Generic_Node(T pData){
		this._Data = pData;
		this._Nodes = null;
	}
	
}
