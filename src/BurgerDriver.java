import java.util.Scanner;
/**
 * 
 * @author Peter Laskai
 *
 */

public class BurgerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputValue = "";
		String burgerType;
		double price;
		Scanner console = new Scanner(System.in);
		Tree<Burger> myTree = new Tree<Burger>();

		while (!inputValue.equalsIgnoreCase("X")) 
		{
			//Menu
			System.out.println("Tree of Burgers' ");
			System.out.println("-----------------------");
			System.out.println("A-Add 'String' to Tree");
			System.out.println("R-Remove 'String' from Tree");
			System.out.println("D-Display contents of Tree");
			System.out.println("S-Display Size of Tree");
			System.out.println("X-Exit");
			System.out.println("Enter a Letter:");
			inputValue = console.nextLine();
			System.out.println("");

			//Results of Input
			if(inputValue.equalsIgnoreCase("S") ) {
				System.out.println("Size: "+myTree.size());
			}
			else if(inputValue.equalsIgnoreCase("A")) {
				System.out.println("Enter the type of Burger:");
				burgerType = console.nextLine();
				System.out.println("Enter the price of Burger:");
				price = console.nextDouble();
				console.nextLine();
				
				System.out.println("");
				myTree.add(new Burger(burgerType, price));
			}
			else if(inputValue.equalsIgnoreCase("R")) 
			{
				System.out.println("Enter a Burger to remove:");
				burgerType = console.nextLine();
				System.out.println("Enter a price to remove:");
				price = console.nextDouble();
				console.nextLine();

				if(myTree.remove( new Burger(burgerType, price)))
				{
					System.out.println("Success!");
					System.out.print("");
				}
				else
					System.out.println("Failure");
				System.out.println("");

			}
			else if(inputValue.equalsIgnoreCase("D"))
			{

				myTree.inOrderPrint();
				System.out.println("");
			}
			else if(inputValue.equalsIgnoreCase("X"))
			{
				System.out.print("Bye!");
			}
			else
			{	
				System.out.println("Error in Input");
			}
		}

	}

}
