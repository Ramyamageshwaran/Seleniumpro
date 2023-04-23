package week1.day1;

public class Mobile {
    public void makecall(String s,float f) {
    	
    	System.out.println("My Mobile Model Name");
		System.out.println(s);
		System.out.println("My Mobile weight is");
		System.out.println(f);
	}
   public void mobileweight(boolean b,int i) {
	System.out.println("My Mobile is Fully Charged");
   System.out.println(b);
   System.out.println("My Mobile Price");
   System.out.println(i);
}   
	public static void main(String[] args) {
     
      Mobile mob=new Mobile();
      System.out.println("This is my Mobile");
      mob.makecall("Apple Iphone X", 140f);
      mob.mobileweight(true, 25000);
      
	}
	  

}
