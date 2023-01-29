package info.facts;

public class CountryClass {
private String nationalColor;
private double populationSize;
private String governmentType;
private String nationalLanguage;

CountryClass (){
	nationalColor = "unset";
	populationSize=0;
	governmentType="unset";
	nationalLanguage="unknown";
}
public CountryClass(double populationSize,String governmentType) {
	this.populationSize=populationSize;
	this.governmentType=governmentType;
}
private CountryClass(String nationalColor,double populationSize,String governmentType,String nationalLanguage) {
	this.nationalColor = nationalColor;
	this.populationSize=populationSize;
	this.governmentType=governmentType;
	this.nationalLanguage=nationalLanguage;
}
public  String getNationalColor() {
	return nationalColor;
}
public  double getPopulationSize() {
	return populationSize;
}
public  String getGovernmentType() {
	return governmentType;
}
public void setNationalColor (String nationalColor){
	this.nationalColor=nationalColor;
}
public void setPopulationSize (double populationSize){
	this.populationSize=populationSize;
}
public void setNationalLanguage (String nationalLanguage){
	this.nationalLanguage=nationalLanguage;
}
public boolean isGreater(double valueCompare){
    if ( this.populationSize >valueCompare) {
      return true;
    }
    else {
       return false;
    }
}

public String nice() {
	
	return " Studying countries is nice";
}
}


