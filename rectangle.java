
public class rectangle {
	
	int length;
	int breadth;
      rectangle()
      {
    	 System.out.println("Constructor with zero parameter called");
    	 length = breadth=0;
      }
      rectangle (int side)
      {
    	  System.out.println("Constructor with one parameter called");
    	  length = breadth = side;
      }
      rectangle(int l,int b)
      {
    	  System.out.println("constructor with two parameters called");
    	  length=l;
    	  breadth=b;
      }
      int area1()
      {
    	  System.out.println(length * breadth);
    	  return(length * breadth);
      }
	
	

}
