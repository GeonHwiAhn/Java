package practice3.model.vo;

public class Horse extends Animal {
	//필드
	private String location;
	private String color;
	
	
	
	public void setLocation(String location) {
		this.location = location;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getLocation() {
		return location;
	}
	public String getColor() {
		return color;
	}
	
	
	public Horse() {
		
	}
	
	public Horse(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	public void speak() {
		System.out.println(super.toString() + " " + location 
				+ "에 서식하며, 색상은 " + color + " 입니다.");
	}
	
}
