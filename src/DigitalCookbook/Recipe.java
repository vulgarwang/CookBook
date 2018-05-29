package DigitalCookbook;
import java.util.*;
public class Recipe {
	private LinkedList<Ingredient> ingredientlist ;
	private LinkedList<String> steps; 
	private String recipename ; 
	private String category ; 
	private int number;
	private double preparationtime ; 
	private double cooktime ; 
	
	Recipe(String recipename , String category,int number ){
		this.number= number ;
		this.recipename = recipename ; 
		this.category = category; 
		this.steps = new LinkedList<String>();
		this.ingredientlist= new LinkedList<Ingredient>();
	}
	
	Recipe(String recipename){
		this.recipename = recipename; 
	}
	
	public void addIngredient(Ingredient ingredient){
		this.ingredientlist.add(ingredient); 
	}
	
	public void addPreparationStep (String step ) {
		steps.add(step);
		
	}
	
	public void setPreparationTime(double time ) {
		this.preparationtime = time ; 
	}
	
	public void setCookingTime(double time ) {
		this.cooktime = time ;
	}
	
	public void showrecipe() {
		System.out.println(recipename + " "+category +" "+number);
		this.showallingredients();
		this.showallsteps();
		
	}
	
	public void showallingredients() {
		Iterator<Ingredient> itr = this.ingredientlist.iterator();
		int i = 0 ;
		System.out.println("The recipe Ingredients"); 
		while(itr.hasNext()) {
			
			System.out.println("The ingredient "+i+" is "+ itr.next().toString());
			i = i +1; 
		}
	}
	
	public void showallsteps() {
		Iterator<String> itr = this.steps.iterator();
		int i = 0 ; 
		System.out.println("The recipe steps");
		while(itr.hasNext()) {
			System.out.println("The recipe Step " + i +" "+ itr.next().toString());
		}
	}
	
	public String getrecipename() {
		return this.recipename; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Recipe recipe = (Recipe) obj;
		if(recipe != null) {
			if(recipe.recipename.equals(this.recipename))
			{
				return true; 
			}
		}
		return false ; 
	}
	
	public String toString() {
		String toString = new String(); 
		toString = "The recipe name is "+ this.recipename + "\n"+ "The category is "+ this.category+ "\n"+ "The number of people is"+ String.valueOf(this.number)+"\n";
	    toString = toString + "The cooktime is " + String.valueOf(this.cooktime)+"\n";
	    toString = toString + "The preparation time is " + String.valueOf(this.preparationtime) + "\n";
		Iterator<Ingredient> itringre = this.ingredientlist.iterator();
	    while(itringre.hasNext()) {
	    	toString = toString+itringre.next().toString();
	    }
	    toString = toString + "\n";
	    Iterator<String> itrsteps = this.steps.iterator();
	    while(itrsteps.hasNext()) {
	    	toString = toString+itrsteps.next().toString() + "\n";
	    }
	    toString = toString+ "\n"; 
		return toString;
	}
	
	
}
