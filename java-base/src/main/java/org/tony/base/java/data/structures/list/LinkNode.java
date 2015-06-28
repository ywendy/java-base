package org.tony.base.java.data.structures.list;

/**
 * 链表节点。
 * 
 * @author a
 *
 */
public class LinkNode {
	/* 指针域. */
	protected LinkNode nextNode;
	/* 数据域. */
	protected int data;

	public LinkNode(int data) {
		this.data = data;
	}

}
