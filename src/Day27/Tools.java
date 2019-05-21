package Day27;

public class Tools {
	public static void main(String[] args) {
		
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
//		for(int i =0; i<tools.length;i++) {
//			System.out.println(tools[i]);
//		}
		for(String tool:tools) {
		 
		switch(tool.toLowerCase()){
		case "java":
			System.out.println("Java --> programming language");
			break;
		case "selenium":
			System.out.println("Selenium --> Test Automation");
			break;
		case "TestNG":
			System.out.println("TestNG --> Unit test");
			break;
		}
		
		}	
	}
}
