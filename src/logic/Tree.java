package logic;

import java.util.ArrayList;

public class Tree {
	
	private static Tree instance = null;
	private ArrayList<Generic_Node> _Nodes;
	
	private Tree() {
		// Exists only to defeat instantiation.
	}
	
	public static Tree getInstance() {
		if(instance == null) {
			instance = new Tree();
		}
		return instance;
	}

}
