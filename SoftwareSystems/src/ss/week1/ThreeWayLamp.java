package ss.week1;

public class ThreeWayLamp {
	
	private int setting;
	
	public ThreeWayLamp(int setting){
		this.setting = setting;
	}

	public static void main(String[] args) {
		ThreeWayLamp lamp = new ThreeWayLamp(0);
		System.out.println(lamp.getSetting());
		lamp.switchSetting();
		System.out.println(lamp.getSetting());
		lamp.switchSetting();
		System.out.println(lamp.getSetting());
		lamp.switchSetting();
		System.out.println(lamp.getSetting());
		lamp.switchSetting();
		System.out.println(lamp.getSetting());
		lamp.switchSetting();
		}
	
	public int getSetting(){
		return setting;
	}
	
	public void switchSetting(){
		setting = (setting + 1) % 4;
	}

}
