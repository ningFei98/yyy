package com.woniu.work2;

public class HomeWork1 {

	//����ˮ
	public void work1() {
		int kong = 10;
		int he = 0;
		while (kong >= 2) {
			he = he + (kong / 3);
			kong = (kong / 3) + (kong % 3);
			if (kong == 2) {
				he++;
				break;
			}
		}
		System.out.println(he);
	}

	//�ҳ��ַ����е�һ��ֻ����һ�ε��ַ�
	public void work2(String str) {
		char[] cs = str.toCharArray();
		String s = "-1";//���û���״���Ψһ�ģ������-1
		for (int i = 0; i < cs.length; i++) {
			//ͨ���ж�һ���ַ����ַ����еĵ�һ�����������һ�������Ƿ���ͬ����ͬ��ʾ�״���Ψһ
			if (str.indexOf(cs[i]) == str.lastIndexOf(cs[i])) {
				s = cs[i] + "";//charתString
				break;
			}
		}
		System.out.println(s);
	}
	public void work2_2(String str) {
		//�����ַ����ֵĿ���---�±�Ϊ0-255��int��ʼֵĬ��Ϊ0
		int[] ascii = new int[256];

        //ͳ���ַ����ֵĴ���������ascii������
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);//ͨ���±�õ�char����תΪint
            ascii[temp]++;//ÿ����һ�Σ������ж�Ӧ�±��int++
        }

        //��˳����б����������ֵĴ˴�Ϊ1���ַ���ӡ����
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);
            if (ascii[temp] == 1){//intΪ1����ֻ����һ��
                char c = (char) temp;//���±�תΪchar�ַ�
                System.out.println(c);
                break;
            }
        }
	}
	
	public static void main(String[] args) {
		HomeWork1 h = new HomeWork1();
		//h.work1();
		h.work2("fasfoapkfa");
		h.work2_2("fasfoapkfa");
	}

}
