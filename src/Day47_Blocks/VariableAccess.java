package Day47_Blocks;

public class VariableAccess {
	//instance variable 
	int myInstanceVar=40;
	//one static variable
	static int myStaticVariable=55;
	
	
	public static void main(String[] args) {
		
		//System.out.println(myInstanceVar);cannot access non-staticfrom static 
		System.out.println(myStaticVariable);
		VariableAccess v=new VariableAccess();
		System.out.println(v.myInstanceVariable);
	}

	
	
}
