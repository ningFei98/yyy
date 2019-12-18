package com.woniu.work2;

public class HomeWork1 {

	//换汽水
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

	//找出字符串中第一个只出现一次的字符
	public void work2(String str) {
		char[] cs = str.toCharArray();
		String s = "-1";//如果没有首次且唯一的，则输出-1
		for (int i = 0; i < cs.length; i++) {
			//通过判断一个字符在字符串中的第一个索引和最后一个索引是否相同，相同表示首次且唯一
			if (str.indexOf(cs[i]) == str.lastIndexOf(cs[i])) {
				s = cs[i] + "";//char转String
				break;
			}
		}
		System.out.println(s);
	}
	public void work2_2(String str) {
		//所有字符出现的可能---下标为0-255，int初始值默认为0
		int[] ascii = new int[256];

        //统计字符出现的次数，存在ascii数组中
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);//通过下标得到char，再转为int
            ascii[temp]++;//每出现一次，数组中对应下标的int++
        }

        //按顺序进行遍历，将出现的此处为1的字符打印出来
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i);
            if (ascii[temp] == 1){//int为1代表只出现一次
                char c = (char) temp;//将下标转为char字符
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
