package Question3;

public class TreeTopper extends TreeDecorator {
	ChristmasTree tree;
	public TreeTopper(ChristmasTree tree) {
		super(tree);
	}
	
	public String decorate() {
		return super.decorate() + decorateWithTreeTopper();
	}
	
	private String decorateWithTreeTopper() {
		return " with Tree Topper";
	}
}
