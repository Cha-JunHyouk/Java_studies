package study_200814;

public class Integer_test {

	public static void main(String[] args) {
		long num=33312332152L;
			System.out.println(num);
		double num2=3.1231563513211153D;
			System.out.println(num2);
		float num3=3.1231563513211153F;
			System.out.println(num3);
		double num4=3.1231563513211153F;
			System.out.println(num4);
			System.out.println(3147483647L+3147483647L);
		double pi=3.1415;
		int wholeNumber=(int)pi;				//����� �� ��ȯ
			System.out.println(pi);
			System.out.println(wholeNumber);
		long extra=30000000000007L;
		int extra2=(int)extra;
			System.out.println(extra);
			System.out.println(Long.toBinaryString(extra));
			System.out.println(extra2);			//���� ����Ʈ�� ��ȿ�� ������ �������� ���� �� ��ȭ
			System.out.println(Integer.toBinaryString(extra2));	
	}

}
