package com.myproject;
 class constructorpen {
	 
	private String colorType=null;
	public constructorpen(String colorType){
		this.colorType = colorType;
		
	}
	public void setColorType (String colorType){
       this.colorType=colorType;
       }
	public String getColorType(){
		return colorType;
	}
	
	
}
 class Ballpen extends constructorpen {
	private String quality=null;
	public Ballpen(String colorType,String quality){
		super(colorType);
		this.setQuality(quality);
		
	}
	
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public String getQuality() {
		return quality;
	}
	
	
	

}
public class PenColorQuality {

	public static void main(String[] args) {
		Ballpen obj=new Ballpen("Red","Good");
		obj.setColorType("Red");
		obj.getColorType();
		System.out.println("Color ::"+obj.getColorType());
		System.out.println("Quality::"+obj.getQuality());
		

	}

}
