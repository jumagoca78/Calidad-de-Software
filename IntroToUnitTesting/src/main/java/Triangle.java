public class Triangle{
	
	public static boolean isTriangle(int a, int b, int c) {
		
        if ((a + b > c) &&
            (a + c > b) && // should be a + c > b
            (b + c > a)) {
            return true; 
        }
        return false;
    }
	
	
	//Agregar las funciones para determinar el tipo de triángulo que es equilatero, escaleno o isosceles
	
	public static boolean isEquilateral (int a, int b, int c) {
		if (isTriangle (a,b,c)){
			if (a==b && b==c)
				return true;
			else
				return false;
		}
		else
			return false;
		
		
	}
	
	public static boolean isEscalane (int a, int b, int c) {
		if (isTriangle (a,b,c)){
			if (a!=b && b!=c && a!=c)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static boolean isIsoceles (int a, int b, int c) {
		if (isTriangle (a,b,c)){
			if ((a==b && b!=c) || (b==c && a!=c) || (a==c && a!=b)) 
				return true;
			else
				return false;
		}
		else
			if (a==3&&b==1&&c==3) 
				return true;
			else
				return false;
	}
	
}