package logic;

import junit.framework.TestCase;
import tree.Tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree arbol = Tree.getInstance();
		System.out.println("1");
		
		Branch rama = new Branch();
		System.out.println("2");
		
		Generic_Node<Branch> Node= new Generic_Node(rama);
		System.out.println("3");
		
		System.out.println("Cantidad de hijos: " + arbol.get_MAX());
		
		//arbol.addNode(Node);
		System.out.println("4");
		
		//arbol.search(arbol.get_Raiz());
		
		for (int i = 0; i < 5; i++){
			arbol.addNode(Node);
		}
		
		System.out.println("Cantidad de nodos: " + arbol.get_Raiz().get_Nodes().size());
		//arbol.search(arbol.get_Raiz());
		
		System.out.println("5");
		Production thread = new Production(87.0, 20, arbol);
		
		thread.run();
		
		System.out.println("6");

	}

}
