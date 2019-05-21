package Day25;

public class Population {
	public static void main(String[] args) {
			
	
	int [] population=new int[5];
	population[0]=5000;
	population[1]=10000;
	population[2]=7000;
	population[3]=8907;
	population[4]=4455;


	
	System.out.println("City 0 population: "+population[0]);
	System.out.println("City 1 population: "+population[1]);
	System.out.println("City 2 population: "+population[2]);
	System.out.println("City 3 population: "+population[3]);
	System.out.println("City 4 population: "+population[4]);
	System.out.println("City 5 population: "+population[4]);
	
	int idx=0;
	System.out.println("City 0 population :"+population[idx]);
	
	idx++;
	System.out.println("City 1 population :" + population[idx]);
	
	String str="abc";
	System.out.println("City population :"+ population[str.length()]);
	
	//String array called cities
	
	String[] cities= {"New York", "Chicago", "LA", "Paris", "Nur-Sultan"};
	//Population of NY is 5000
	
	System.out.println("Population of "+cities[0]+" is "+population[0]);
	System.out.println("Population of "+cities[1]+" is "+population[1]);
	System.out.println("Population of "+cities[2]+" is "+population[2]);
	System.out.println("Population of "+cities[3]+" is "+population[3]);
	System.out.println("Population of "+cities[4]+" is "+population[4]);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	}

}
