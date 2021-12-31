package Question1;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface{
	OldCoffeeMachine ocm = new OldCoffeeMachine();
	@Override
	public void chooseFirstSelection() {
		// TODO Auto-generated method stub
		ocm.selectionA();
	}

	@Override
	public void chooseSecondSelection() {
		// TODO Auto-generated method stub
		ocm.selectionB();
	}
}
