package utils;


public class UtilsMath {

	float a =1;
	float b =2;
	
	
	public float calculeSomme(float a, float b) {
		this.a=(int) a;
		this.b=b;
		return (a+b)*2;
	}
	public Long addition(Long a, Long b) {
		return a+b;
	}
	public int additionInt(int a, int b) {
		return a+b;
	}
	
	public double calculsqrt(float a , float b) {
		this.a=a;
		this.b=b;
		double c =Math.abs(a);
		double d =Math.abs(b);
		return Math.sqrt(c*d);
	}
	
}
