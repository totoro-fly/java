
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[350];
		int[] b = new int[350];
		for (int i = 0, j = 1; i < 350; i++, j++)
			a[i] = j;
		for (int i = 0; i < 350; i++) {
			boolean tf = r();
			out(a[i], b[i], tf);
		}
	}

	public static boolean r() {
		int r = (int) (Math.random() * 100);
		boolean tf = r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5 || r == 6 || r == 7 || r == 8 || r == 9
				? false : true;
		return tf;
	}

	public static void out(int a, int b, boolean tf) {
		if (tf == true && b == 0) {
			System.out.print("��" + a + "����ͨ��\n");
		} else if (tf == false && b == 0) {
			System.out.println("��" + a + "��һ�μ���쳣�������¼�⡣");
			b++;
			boolean tf2 = r();
			out(a, b, tf2);
		} else if (tf == true && b == 1) {
			System.out.println("��" + a + "�ڶ��μ���������ٴ��ز�");
			b++;
			boolean tf3 = r();
			out(a, b, tf3);
		} else if (tf == false && b == 1)
			System.out.println("��" + a + "�ڶ��μ���쳣����ȡ��");
		else if (tf = true && b == 2) {
			System.out.println("��" + a + "�����μ��������ͨ��");
		} else
			System.out.println("��" + a + "�����μ���쳣����ȡ��");
	}
}
