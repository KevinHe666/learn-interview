package com.kevin.learn.structures.all.demo8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestFile {
	public static void main(String[] args) throws Exception {
		//字符串转byte数组
		String binaryStr = "11110000111001011000110100011111000011001111100001101101110110011111000011111000001101011101100111110000110011111000110011";
		int len;
		if(binaryStr.length()%8==0) {
			len=binaryStr.length()/8;
		}else {
			len=binaryStr.length()/8+1;
		}
		byte[] b = new byte[len];
		int j=0;
		for(int i=0;i<binaryStr.length();i+=8) {
			String tempStr;
			if(i+8>binaryStr.length()) {
				tempStr = binaryStr.substring(i);
			}else {
				tempStr = binaryStr.substring(i, i+8);
			}
			b[j] = (byte) Integer.parseInt(tempStr,2);
			j++;
		}
		
		String msg = "can you can a can as a can canner can a can.";
		byte[] bytes = msg.getBytes();
		OutputStream os = new FileOutputStream("1.data");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(bytes);
		oos.close();
		os.close();
	}
}
