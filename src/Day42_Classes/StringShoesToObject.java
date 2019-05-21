package Day42_Classes;

public class StringShoesToObject {
public static void main(String[] args) {
	String data="Bruno Magly,9.5";
	String[] arrData=data.split(",");
	
	Shoes shoes=new Shoes();
	shoes.setShoesData(arrData[0],Double.parseDouble(arrData[1]));
	System.out.println(shoes.getShoesData());
	
	
	
}
}
