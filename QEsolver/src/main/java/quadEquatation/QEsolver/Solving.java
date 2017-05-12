package quadEquatation.QEsolver;

public class Solving {
	
	public double[] solvingEquatution (double a, double b, double c, double D) throws DivExeption{
		
		double[] resultArray = new double[2];
		double x1;
		double x2;
		
		if (a == 0.0){
			throw new DivExeption();}
		
		x1 = (-b + Math.sqrt(D))/(2*a);
		x2 = (-b - Math.sqrt(D))/(2*a);
		resultArray[0] = x1;
		resultArray[1] = x2;
		return resultArray;}
	
	public double solvingEquatution (double a, double b)  throws DivExeption{
		
		if (a == 0.0){
			throw new DivExeption();}
		
		double x1 = -b/(2*a);
		return x1;}
}