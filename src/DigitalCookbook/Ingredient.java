package DigitalCookbook;

public class Ingredient {
	private String ingredientname;
	private double amount ;
	private String unit ; 
	private String description; 
	
	Ingredient(String ingredientname, double amount, String unit){
		this.ingredientname=ingredientname; 
		this.amount = amount ; 
		this.unit = unit; 	
	}
	Ingredient(String ingredientname, double amount , String unit, String description){
		this.ingredientname = ingredientname; 
		this.amount = amount ; 
		this.unit = unit; 
		this.description = description ; 
		
	}
	
	public String toString() {
		String Tostring  =  new String();
		Tostring = this.ingredientname +" "+ String.valueOf(this.amount)+" "+ this.unit+ " " + this.description+"\n";
		
		
		return Tostring;
	}
}