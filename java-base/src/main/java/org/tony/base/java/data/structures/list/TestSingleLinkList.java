package org.tony.base.java.data.structures.list;

public class TestSingleLinkList {
	
	public static void main(String[] args) {
		SingleLinkList list = new SingleLinkList();
		list.addFirst(3);
		list.addNode(4, 1);
		list.addNode(5, 2);
		list.addNode(6, 3);
		list.addNode(7, 4);
		list.addNode(8, 5);
		list.dispaly();
		
		list.reverseList();
		list.dispaly();
	}

}
