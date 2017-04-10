package packA;
//Team : Cessna Skyhawk
//Michael Jordan
//Lucy Byrne
//Fiachra Dunn
//

import javax.swing.ImageIcon;

class Property {
	private String name, shortName;
	private Integer owner;
	private int price;
	private int houses;
	private int colour;
	private int mortgageValue;
	private int redeemValue;
	private boolean mortgagedProperty;
	private int[] rentArray;
	private int housePrice;
	private int squareNumber;
	private ImageIcon cardImage;
	
	public Property(String name, int squareNumber){
		this.name = name;
		this.squareNumber = squareNumber;
	}
	public Property(String name, String shortName, int owner, int price, int[] rent, int colour, int mortgageValue, boolean mortgagedProperty, int housePrice, int squareNumber){
		this.name = name;
		this.shortName = shortName;
		this.owner = owner;
		this.price = price;
		this.rentArray = rent;
		this.colour = colour;
		this.mortgageValue = mortgageValue;
		this.mortgagedProperty = mortgagedProperty;
		this.housePrice = housePrice;
		this.squareNumber = squareNumber;
		
		this.redeemValue = (int)(1.1 * (double)mortgageValue);
	}
	
	public Property(String name, int[] rent, int squareNumber){
		this.name = name;
		this.rentArray = rent;
		this.squareNumber = squareNumber;
	}

	public String returnName(){
		return name;
	}
	
	public String returnShortName(){
		return shortName;
	}

	public Integer returnOwner(){
		return owner;
	}

	public void setOwner(int playerNum){
		owner = playerNum;
	}

	public int returnPrice(){
		return price;
	}

	public int returnRent(){
		if (rentArray == null){
			return 0;			//return 0 if rent doesn't exist.
		}
		return rentArray[houses];
	}
	

	public void boughtProperty(int playerNum){
		owner = playerNum;
	}
	
	public int returnColour(){
		return colour;
	}
	
	public int returnMortgageValue(){
		return mortgageValue;
	}
	
	public void mortgage(){
		mortgagedProperty = true;
	}
	
	public boolean isMortgage(){
		return mortgagedProperty;
	}
	
	public int returnRedeemValue(){
		return redeemValue;
	}
	
	public void redeem(){
		mortgagedProperty = false;
	}
	
	public int returnHouses(){
		return houses;
	}
	
	public int returnHousePrice(){
		return housePrice;
	}
	
	public int returnSquareNumber(){
		return squareNumber;
	}
	
	public Integer setHouses(int newHouses){	//Sets how many houses are on property.
		if(newHouses >= 0 
		 && newHouses < 
		 rentArray.length){
			houses = newHouses;
			return rentArray[houses];
		}
		else return null;
	}
	
	public void setImage(String url){
			if((this.getClass().getResource(url)) != null)
			cardImage = new ImageIcon ((this.getClass().getResource(url)));
			else
			cardImage = null;
	}
	public ImageIcon getImage(){
		if(cardImage != null){
			return cardImage;
		}
		else return null;
	}
}