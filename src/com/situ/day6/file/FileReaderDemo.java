package com.situ.day6.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

public class FileReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("demo.txt");
			int ch1 = fileReader.read();
			System.out.println(ch1);
			System.out.println((char)ch1);
			
			int ch2 = fileReader.read();
			System.out.println(ch2);
			System.out.println((char)ch2);
			
			int ch3 = fileReader.read();
			System.out.println(ch3);
			System.out.println((char)ch3);
			
			int ch4 = fileReader.read();
			System.out.println(ch4);
			System.out.println((char)ch4);
			
			int ch5 = fileReader.read();
			System.out.println(ch5);
			System.out.println((char)ch5);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFileReaderBuffer() {
		//2的0=1
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("demo.txt");
			writer = new FileWriter("demo_bak.txt");
			char[] buffer = new char[1024];
			int length = 0;
			while ((length = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//复制一张图片
	@Test
	public void testInputstream() {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream("aa.png");
			outputStream = new FileOutputStream("aa_bak.png");
			byte[] buffer = new byte[1024];
			int length = 0;
			while ((length = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, length);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
