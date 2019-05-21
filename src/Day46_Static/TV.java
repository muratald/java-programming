package Day46_Static;

public class TV {

	int channel=1;
	  int volumeLevel=1;
	  boolean on=false;
	  String brand ="undefined";
	  
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel<=0 &&channel>=120&&on) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}else 
		this.channel = channel;
		
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(volumeLevel>0 && volumeLevel<8 && on)
		this.volumeLevel = volumeLevel;
		else
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}	
	
	TV(){
		System.out.println("Creating TV object using no Args- constructor");
		
	}
	
	TV(String brand){
		System.out.println("Creating TV object using 1 arg - constructor");
		
	}
	void channelUp(){
		setChannel(channel+1);
	
	}
	void channelDown() {
		setChannel(channel-1);
	}
	
	void turnOn() {
		if(on) 
			System.out.println("TV is already ON");
		else 
			on=true;
	}
	void turnOff() {
		if(on==false)
			System.out.println("TV is already OFF");
		else
			on=false;
	}
	
	
}
