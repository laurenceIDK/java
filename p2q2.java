/*
 x > 1:
 	lower = 1
 	upper = x
 	midpoint(lower, upper):
 		midpoint^2 > x:
 			upper = midpoint
 		midpoint^2 < x:
 			lower = midpoint
 	
 	repeat until precision 8
 	if (midpoint < 1e-8 ) {		
 		}
 	
 x < 1:
 	lower = x
 	upper = 1
 	midpoint(lower, upper):
 		midpoint^2 > x:
 			upper = midpoint
 		midpoint^2 < x:
 			lower = midpoint
 	repeat until precision 8
 **/ 
 
public class p2q2 {
	
	public static double toRoot(double num, double lower, double upper, double midpoint) {
		
		do {
			midpoint = (lower+upper) / 2;
			
			if (Math.pow(midpoint, 2) > num) {
				upper = midpoint;
			} else {
				lower = midpoint;
			}
			
		} while ();
		
	}
    
    public static void main(String[] args) {
    	double num = 3;
    	double lower = 0, upper = 0, midpoint = 0; 
    	
    	if (num < 1) {
    		toRoot(num, num, 1, midpoint);
    	} else if (num > 1) {
    		toRoot(num, 1, num, midpoint);
    	} else	{
    		sqrt = num;
    	}
    }
}

/*
 * sqrt 3 > 1:
 	lower 1 upper 3
 	
 	2^2 -> 4 > 3:
 		upper = 2 
 	
 	1.5^2 -> 2.25 < 3:
 		lower = 1.5
 		
 	1.75^2 -> 3.0625 > 3:
 		upper = 1.75
 		
 	1.625^2 -> 2.64 < 3:
 		lower = 1.625
 	
 	1.6875 -> 2.84 < 3:
 		lower = 1.6875
 		
 	1.71875 -> 2.954 < 3:
 		lower = 1.71875
 	
 	1.734375 -> 3.008 > 3:
 		upper = 1.734375
 	
 	1.7265625 -> 2.98 < 3:
 		lower = 1.7265625
 		
 	1.73046875 -> 2.99 < 3:
 		lower = 1.73046875
 		
 	1.732421875 -> 3.001 > 3:
 		upper = 1.732421875
 	
 	1.7314453125 -> 2.997 < 3:
 		lower = 1.7314453125
 		
 	

*/
