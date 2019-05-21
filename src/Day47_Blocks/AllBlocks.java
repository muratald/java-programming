package Day47_Blocks;

public class AllBlocks {
static {
	System.out.println("static block - I run first and only once");
	
}

{
	System.out.println("INIT BLOCK - I run each time object is created. Before constructor");
}
public AllBlocks() {
	System.out.println("Constructor - I run each time object is created");
	
}

}
