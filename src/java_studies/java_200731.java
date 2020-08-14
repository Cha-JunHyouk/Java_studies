package java_studies;

public class java_200731 {

	public static void main(String[] args) {
//200731 100 이하의 3과 4의 공배수 찾기 알고리즘 실제 구현해보기(200811)
		int count=0;
		int n=1;
		while (n<=100)
		{
			boolean isCmnmult=n%3==0;
			if (isCmnmult)
			{
				boolean isCmnmult2=n%4==0;
				if (isCmnmult2)
				
					count+=1;
				
			}
			n++;
		}
		System.out.println("100이하인 3과 4의 공배수의 갯수는 "+count+"입니다.");
	}

}
