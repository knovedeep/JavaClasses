package info.facts;

public class Using {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryClass USA = new CountryClass();
	
		USA.setPopulationSize(1064565000);
		//This method is checking if USA's population size is larger than 100
		System.out.println(USA.isGreater(100));
		System.out.println(USA.nice());
	}

}
