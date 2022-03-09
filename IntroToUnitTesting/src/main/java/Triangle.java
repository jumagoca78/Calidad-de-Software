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
	
}