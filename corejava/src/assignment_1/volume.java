package assignment_1;

import OVER_LOADING.simple_cal;

 class volume {
	void cube(int a)
	{
		System.out.println("The volume of cube is ="+a*a*a);
		
	}
	void cuboid(float l ,float b,float h)
	{
		System.out.println( "the volume of cuboid is ="+l*b*h);
	
	
				
	}
	
	
	void sphere(float r)
	{
		System.out.println("the volume of sphere is ="+(4/3*3.14*r*r*r));
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume ob= new volume();
        ob.cube(5);
	    ob.cuboid(2, 5, 6);
	    ob.sphere(5);


}
 }