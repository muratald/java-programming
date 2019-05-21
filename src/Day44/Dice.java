package Day44;

import java.util.ArrayList;

public class Dice {
	public static void main(String[] args) {
		Job job1 = new Job();
		Job job2=new Job("Java Developer");
		
		Job job3=new Job("SDET","Amazon",130_000.0);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		ArrayList<Job>jobsList=new ArrayList<>();
		jobsList.add(job3);
		jobsList.add(new Job("Scrum Master","Google",150_000));
		jobsList.add(new Job("SDET","Freddie Mac",115_000));
		jobsList.add(new Job("BA","Leidos",110_000));
		jobsList.add(new Job("Senior QA Tester","Delta",150_000));
		
		System.out.println(jobsList.toString());
		
		//find the highest paying job and print toString for that
		
		double highestPaid=0.0;
		int highestIndex=-1;
		for(int i=0;i<jobsList.size();i++) {
			if(jobsList.get(i).getAnnualSalary()>highestPaid) {
				highestPaid=jobsList.get(i).getAnnualSalary();
				highestIndex=i;
				
			}
		}
		System.out.println("Highest Salary: "+jobsList.get(highestIndex));
	}
	
}
