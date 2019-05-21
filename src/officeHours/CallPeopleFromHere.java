package officeHours;

public class CallPeopleFromHere {
	public static void main(String[] args) {
		People mymanNursultan=new People();
		System.out.println(mymanNursultan.hardToGet);
		
		System.out.println(People.easyToGet);
		
		mymanNursultan.sayMyName();
		
		People.whatMyName();
	}
}
