/*
 * Peter Laskai
 */
public class Tree<E extends Comparable<E>>
{
	private BTNode<E> root;
	private int numItems;
	/**
	 * no arg constructor
	 */
	public Tree()
	{
		root = null;
		numItems = 0;
	}
	/**
	 * Adds an Extra E(Comparable) to the Tree
	 * @param element which is the target varable
	 */
	public void add(E element)
	{
		if( root == null)
		{
			root = new BTNode<E>(element, null, null);
			numItems++;
		}
		else
		{
			BTNode<E> cursor = root;
			boolean done = false;

			while(!done)
			{
				if(element.compareTo(cursor.getData()) <=0)
				{
					if(cursor.getLeft() == null)
					{
						cursor.setLeft(new BTNode<E>(element, null , null));
						done = true;
						numItems++;
					}
					else
						cursor = cursor.getLeft();
				}
				else
				{
					if(cursor.getRight() == null)
					{
						cursor.setRight(new BTNode<E>(element, null, null));
						done = true;
						numItems++;

					}
					else
						cursor = cursor.getRight();
				}
			}
		}

	}
	/**
	 * To remove Type E from the Tree
	 * @param element the target variable
	 * @return done to see if remove was successful
	 */
	public boolean remove(E element)
	{
		BTNode<E> cursor = root;
		BTNode<E> parentOfCursor = null;
		boolean done = false;

		while(cursor != null && !done)
		{
			if(element.equals(cursor.getData()))
				done = true;
			else if(element.compareTo(cursor.getData()) <= 0)
			{
				parentOfCursor = cursor;
				cursor = cursor.getLeft();
			}
			else
			{
				parentOfCursor = cursor;
				cursor = cursor.getRight();
			}

		}
		if(cursor == null)
		{
			done = false;
		}
		else if(cursor.getLeft() == null && cursor == root)
		{
			root = root.getRight();
			numItems--;
		}
		else if(cursor.getLeft() == null && cursor != root)
		{
			if(cursor == parentOfCursor.getLeft())
			{
				parentOfCursor.setLeft(cursor.getRight());
			}
			else
				parentOfCursor.setRight(cursor.getRight());
			numItems--;
		}
		else
		{
			cursor.setData(cursor.getLeft().getRightMostData());
			cursor.setLeft(cursor.getLeft().removeRightMost());
			numItems--;
		}

		return done;
	}
	/**
	 * returns the num of elements in Binary Tree
	 * @return num Items
	 */
	public int size()
	{
		return numItems;

	}
	/**
	 * calls inaOrderPrint from BTNode<E>
	 */
	public void inOrderPrint()
	{
		if(root != null)
			root.inOrderPrint();
		else
			System.out.println("Empty");
	}
}
