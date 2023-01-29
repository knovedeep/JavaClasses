package constructor.Class;

public class Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetClass catOne = new PetClass();
		
		System.out.println(catOne.getName());
		catOne.setName("Dio");
		catOne.setLocation("California");
		catOne.setAge(1);
		System.out.println(catOne.getName());
		System.out.println(catOne.getAge());
		System.out.println(catOne.getLocation());
		System.out.println(catOne.getType());
	}

}
