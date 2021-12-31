package Question3;

public class Demo {
	public static void main(String[] args) {
		ChristmasTree tree1, tree2, tree3, tree4;
		
		//decorate tree1 with tree topper 
		tree1 = new TreeTopper(new ChristmasTreelmpl());
		System.out.println(tree1.decorate());
		
		//decorate tree2 with tree topper and tinsel
		tree2 = new TreeTopper(new Tinsel(new ChristmasTreelmpl()));
		System.out.println(tree2.decorate());
		
		//decorate tree3 with tree topper, tinsel and garland
		tree3 = new TreeTopper(new Tinsel(new Garland(new ChristmasTreelmpl())));
		System.out.println(tree3.decorate());
		
		//decorate tree4 with tree topper, tinsel, garland and bubble lights
		tree4 = new TreeTopper(new Tinsel(new Garland(new BubbleLights(new ChristmasTreelmpl()))));
		System.out.println(tree4.decorate());
	}
}
