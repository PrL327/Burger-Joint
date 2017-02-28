/*
 * Peter Laskai
 * Lab 11
 */

public class BTNode<E> 
{
	private E data;
	private BTNode<E> left;
	private BTNode<E> right;

	/**
	 * Constructor
	 * @param newData for the New BTNode
	 * @param newLeft new left link for the New BTNode
	 * @param newRight new right link for the New BTNode
	 */
	public BTNode(E newData, BTNode<E> newLeft, BTNode<E> newRight)
	{
		data = newData;
		left = newLeft;
		right = newRight;

	}
	/**
	 * returns the node's data
	 * @return data value E from field 
	 */
	public E getData()
	{
		return data;

	}
	/**
	 * Returns the nodes left pointer
	 * @return left a Node<E> from the left field
	 */
	public BTNode<E> getLeft()
	{
		return left;

	}
	/**
	 * Returns the right pointer
	 * @return right Node<E> from the Right field
	 */
	public BTNode<E> getRight()
	{
		return right;

	}
	/**
	 * void print method displays trees
	 */
	public void inOrderPrint()
	{
		if(left != null)
			left.inOrderPrint();

		System.out.println(data);

		if(right != null)
			right.inOrderPrint();

	}
	/**
	 * stores value data for BTNode
	 * @param newData The value to store
	 */
	public void setData(E newData)
	{
		data = newData;
	}
	/**
	 * Stores a value in the right field
	 * @param newLeft the left value to store
	 */
	public void setLeft(BTNode<E> newLeft)
	{
		left = newLeft;
	}
	/**
	 * Stores a value in the right field
	 * @param newRight right value to store
	 */
	public void setRight(BTNode<E> newRight)
	{
		right = newRight;
	}
	/**
	 * finds the right most data in a recursive wa
	 * @return data gets the Right most pointer
	 */
	public E getRightMostData()
	{
		if(right == null)
		{
			return data;
		}
		else
			return right.getRightMostData();
	}
	/**
	 * removes the Right field from the tree
	 * @return left the left field
	 * @return this the value on which it is on
	 */
	public BTNode<E> removeRightMost()
	{
		if(right == null)
		{
			return left;
		}
		else
		{
			right = right.removeRightMost();
			return this;
		}
	}
}

