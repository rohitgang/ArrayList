

import java.util.ArrayList;
import java.util.Random;

/**
 * Use an ArrayList to store a collection of objects and use a for-each loop to process the objects.
 * 
 * @author amit, Rohti Gangurde
 *
 */
public class ArrayListExercise {

    public static void main(String[] args)
    {
        Random rand = new Random();
        final int RADIUS_MAX = 100;
        //TODO: declare a constant for the number of spheres NUM_SPHERES and 
        //      initialize it appropriately
final int NUM_SPHERES;
        //TODO: Declare the ArrayList to hold the Sphere objects
        ArrayList<Sphere> sph = new ArrayList<Sphere>();
        //TODO: Create the spheres using a normal for loop and add them to an ArrayList<Sphere>
     for(int i=0; i<4;i++)
     {
    	 sph.add(new Sphere(rand.nextInt(RADIUS_MAX)));
     }
       
      int i =1;  //TODO: Convert to a for-each loop to print out the spheres
     for(Sphere members : sph)
     
        System.out.println("Sphere "+i+": \t" + members + "\n");
       
         double temp = 101000000;
        //TODO: Convert to a for-each loop to find the volume of the smallest sphere
     for(Sphere member: sph)
     {
    	 if( member.getVolume()<temp)
    		 temp = member.getVolume();
     }

        System.out.printf("Volume of the smallest sphere: %.2f\n", temp);
    }
}