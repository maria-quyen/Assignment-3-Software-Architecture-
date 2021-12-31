package Question3;

public class Garland extends TreeDecorator{
	ChristmasTree tree;
	public Garland(ChristmasTree tree) {
		super(tree);
	}
	public String decorate() {
		return super.decorate() + decorateWithGarland();
	}
	
	private String decorateWithGarland() {
		return " with Garland";
	}
}
