package Question1;

import java.util.*;

public class NewCoffeeMachine{
	public static void main (String[] args){
		int choose, choose1;
		Scanner in = new Scanner(System.in);
		CoffeeTouchScreenAdapter oldVendingMachine = new CoffeeTouchScreenAdapter();
		
		System.out.println("1.Old Vending Machine");
		System.out.println("=> choose: ");
		choose = in.nextInt();
		
		if (choose == 1){
			System.out.println("1. SELECTION A");
			System.out.println("2. SELECTION B");
			System.out.println("=> you choose: "); 
			choose1 = in.nextInt();
			if (choose1 == 1){
				oldVendingMachine.chooseFirstSelection();
			}
			else if (choose1 == 2){
				oldVendingMachine.chooseSecondSelection();
			}
			else{
				System.out.println("None");
			}
		}
		else{
			System.out.println("None");
		}
		in.close();
	}
}
