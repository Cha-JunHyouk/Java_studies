package java_studies;

public class java_200731 {

	public static void main(String[] args) {
//200731 100 ������ 3�� 4�� ����� ã�� �˰��� ���� �����غ���(200811)
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
		System.out.println("100������ 3�� 4�� ������� ������ "+count+"�Դϴ�.");
	}

}
