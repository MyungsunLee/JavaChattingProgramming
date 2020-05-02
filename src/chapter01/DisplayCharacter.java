package chapter01;

import java.io.*;
public class DisplayCharacter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		for (int i = 32; i < 127; i++) {
			System.out.write(i);	// 32~127까지의 정수 값을 화면에 출력
			
			if (i%8 == 7) 
				System.out.write('\n');	// 8개의 문자를 출력하고 줄을 바꾼다
			else
				System.out.write('\t');	// 하나으 ㅣ문자를 출력하고 탭을 출력한다
			
		}
		System.out.write('\n');
		
	}

}
