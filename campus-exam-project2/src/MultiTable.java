import java.util.Scanner;

public class MultiTable {
	
	public MultiTable() {
		Scanner sc = new Scanner (System.in);
		String str;
		while(true) {
			str = sc.nextLine();
			
			System.out.println("1~999������ ������ �Է����ּ���");
			try { // str�� ������ �Ľ� �õ�
				a = Integer.parseInt(str);
			}
			catch(Exception ex) { // ����
				System.out.println("������ �ƴմϴ�.");
			}
			if(a>0&&a<1000) // �����ΰ��
				break;
			else // ������ ��� ���
				System.out.println("������ ������ϴ�.");
		}
		sc.close();
	}
	
	public void Print() {
		for(int i =1; i<10; i++)
			System.out.printf("%d x %d = %d\n",a,i,a*i);
	}
	
	public int a = 0;
}
