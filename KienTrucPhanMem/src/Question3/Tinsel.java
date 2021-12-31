package Question3;

public class Tinsel extends TreeDecorator{
	ChristmasTree tree;
	public Tinsel(ChristmasTree tree) {
		super(tree);
	}
	public String decorate() {
		return super.decorate() + decorateWithTinsel();
	}
	
	private String decorateWithTinsel() {
		return " with Tinsel";
	}
}
