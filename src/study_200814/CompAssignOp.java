package study_200814;

public class CompAssignOp 
{

	public static void main(String[] args) 
	{
		short num=10;
		num=(short)(num+77L);	//short이 long보다 작은 자료형이기 때문에 명시적 형 변환 필요함
		int rate=3;
		rate=(int)(rate*3.5);	//int가 float혹은 double보다 작은 자료형이기때문에 명시적 형 변환 필요함
			System.out.println(num);
			System.out.println(rate);
		
		num=10;
		num+=77L;				//형 변환이 필요하지 않다??
		rate=3;
		rate*=3.5;				//형 변환이 필요하지 않다??
			System.out.println(num);
			System.out.println(rate);
	}

}
