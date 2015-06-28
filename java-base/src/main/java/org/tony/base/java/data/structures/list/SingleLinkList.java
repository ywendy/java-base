package org.tony.base.java.data.structures.list;

/**
 * 单链表。
 * 
 * @author a
 *
 */
public class SingleLinkList {

	/* 头指针. */
	private LinkNode firstNode;
	/* 节点的位置. */
	private int pos = 0;

	public SingleLinkList() {
		this.firstNode = null;// 初始化头指针为空.
	}

	/**
	 * 显示单链表中的数据.
	 */
	public void dispaly() {
		if (firstNode != null) {
			LinkNode tmpNode = firstNode;
			System.out.print("[" + firstNode.data + ",");
			while (tmpNode.nextNode != null) {
				System.out.print(tmpNode.nextNode.data + ",");
				tmpNode = tmpNode.nextNode;
			}
			System.out.print("]");
		}

	}

	/**
	 * 单链表逆序操作.
	 */
	public void reverseList() {

		if (this.firstNode == null) {
			return;
		}

		LinkNode current = this.firstNode.nextNode; // 指向第一个
		LinkNode pnext = current.nextNode;// 指向第一个的下一个
		current.nextNode = null;// 把第一个的下一个变为null.
		LinkNode firstNext = current;

		while (pnext != null) {// 下一个不为空，开始循环.
			LinkNode prev = pnext.nextNode;
			pnext.nextNode = current;
			// 重新选择current 和pnext
			current = pnext;
			pnext = prev;
		}
		//对头指针操作，把表头弄到末尾.
		this.firstNode.nextNode = null;
		firstNext.nextNode = this.firstNode;
		this.firstNode = current;// current 始终指向反转后的第一个元素.

	}

	/**
	 * 插入头节点.
	 * 
	 * @param data
	 */
	public void addFirst(int data) {
		LinkNode node = new LinkNode(data);
		node.nextNode = firstNode;
		firstNode = node;
	}

	/**
	 * 删除头节点.
	 * 
	 * @return
	 */
	public LinkNode delFirstNode() {
		LinkNode tmpNode = firstNode;
		firstNode = firstNode.nextNode;
		return tmpNode;

	}

	/**
	 * 在给定的位置插入一个节点。
	 * 
	 * @param data
	 * @param index
	 */
	public void addNode(int data, int index) {
		if (index < pos) {
			return;
		}
		LinkNode node = new LinkNode(data);
		LinkNode current = firstNode;
		LinkNode prev = firstNode;
		while (pos != index) {
			prev = current;
			current = current.nextNode;
			pos++;
		}
		prev.nextNode = node;
		node.nextNode = current;
		pos = 0;

	}

}
