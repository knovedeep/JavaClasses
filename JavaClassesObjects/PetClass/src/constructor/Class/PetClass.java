package constructor.Class;

public class PetClass {
	//u now need to add information about what a car class "is"
	//two major pieces of info u need:
	//1. What variables do u need to have inside the object
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	 PetClass () {
		name="default";
		age=0;
		location="default";
		type="unkown";	
	}
	private PetClass (String name,int age, String location, String type){
		this.name=name;
		this.age=age;
		this.location=location;
		this.type=type;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getType() {
		return type;
	}
	public String getLocation() {
		return location;
	}
	public void setName (String name){
		this.name=name;
	}
	public void setAge (int age){
		this.age=age;
	}
	public void setLocation (String location){
		this.location=location;
	}
	
}