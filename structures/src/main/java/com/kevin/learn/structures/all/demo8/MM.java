package com.kevin.learn.structures.all.demo8;

public class MM {
	public static void main(String[] args) {
		String msg = "can you can a can as a can canner can a can.";
		// 直接编码
//		char[] strChar = msg.toCharArray();
//		String result = "";
//		for (int i = 0; i < strChar.length; i++) {
//			String temp = Integer.toBinaryString(strChar[i]);
//			while (temp.length() <= 8) {
//				temp = "0" + temp +" ";
//			}
//			result += temp;
//		}
//		System.out.println(result);

		// 统计字符数量并排序
//		Map<Character, Integer> map = new HashMap<>();
//		for (char c : msg.toCharArray()) {
//			Integer i = map.get(c);
//			if (i == null) {
//				map.put(c, 1);
//			} else {
//				map.put(c, i + 1);
//			}
//		}
//		List<Cc> cs = new ArrayList<>();
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			cs.add(new Cc(entry.getKey(), entry.getValue()));
//		}
//		Collections.sort(cs);
//		cs.stream().forEach(x->{System.out.print(x.getC()+":"+x.getCount()+" ");});

		// 赫夫曼编码
//		 Map<Character, String> hfm = new HashMap<>();
//		 hfm.put('n', "00");
//		 hfm.put(' ', "01");
//		 hfm.put('a', "10");
//		 hfm.put('c', "111");
//		 hfm.put('o', "11000");
//		 hfm.put('y', "110010");
//		 hfm.put('.', "110011");
//		 hfm.put('u', "110100");
//		 hfm.put('e', "110101");
//		 hfm.put('r', "110110");
//		 hfm.put('s', "110111");
//		 String result="";
//		 for(char c:msg.toCharArray()) {
//		 result+=hfm.get(c);
//		 }
//		 System.out.println(result);
		
		//字符串转byte数组
//		String binaryStr = "11110000111001011000110100011111000011001111100001101101110110011111000011111000001101011101100111110000110011111000110011";
//		int len;
//		if(binaryStr.length()%8==0) {
//			len=binaryStr.length()/8;
//		}else {
//			len=binaryStr.length()/8+1;
//		}
//		byte[] b = new byte[len];
//		int j=0;
//		for(int i=0;i<binaryStr.length();i+=8) {
//			String tempStr;
//			if(i+8>binaryStr.length()) {
//				tempStr = binaryStr.substring(i);
//			}else {
//				tempStr = binaryStr.substring(i, i+8);
//			}
//			b[j] = (byte) Integer.parseInt(tempStr,2);
//			j++;
//		}
//		System.out.println(b.length);
//		System.out.println(Arrays.toString(b));
	}

}
