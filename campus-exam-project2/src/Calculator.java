import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	private BufferedReader br;
	private float a, b;

	public Calculator() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		a = getNum();
		b = getNum();

		calc();
	}

	private void calc() throws IOException {
		String c;
		System.out.println("���ϴ� ������ �Է����ּ��� [+ - * / %]");
		while (true) {
			c = br.readLine();
			switch(c) { //����ġ�� ����� �Լ������� ���������� return ���
			case "+":
				System.out.printf("%f %s %f = %f\n", a, c, b, a + b);
				return;
			case "-":
				System.out.printf("%f %s %f = %f\n", a, c, b, a - b);
				return;
			case "*":
				System.out.printf("%f %s %f = %f\n", a, c, b, a * b);
				return;
			case "/":
				System.out.printf("%f %s %f = %f\n", a, c, b, a / b);
				return;
			case "%":
				System.out.printf("%f %s %f = %f\n", a, c, b, a % b);
				return;
			}
			System.out.println("�����ڰ� �ƴմϴ�. �ٽ��Է����ּ���.");
		}
	}

	private float getNum() throws IOException {
		System.out.println("�Ǽ��� �Է����ּ���");
		String str = br.readLine();
		while (true) {
			if (checkNumber(str)) {
				return Float.parseFloat(str);
			} else {
				System.out.println("�Ǽ��� �ƴմϴ�, �ٽ� �Է����ּ���");
			}
		}
	}

	private boolean checkNumber(String s) {
		try {
			Float.parseFloat(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
