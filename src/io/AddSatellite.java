package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddSatellite {
	public void Add() {
		System.out.println("����leave�뿪��");
		String str_all = "";
		String leave = "";
		while (true) {
			System.out.println("��������������");
			Scanner s = new Scanner(System.in);
			String str = null;

			str = s.next();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}

			if (str.length() > 0 && str.length() < 18) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("���Ƹ�ʽ����ȷ");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("���������Ǳ��");
			Scanner s = new Scanner(System.in);
			String str = null;
			str = s.next();
			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher matcher = pattern.matcher((CharSequence) str);
			boolean result = matcher.matches();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}
			if (result) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("ֻ����������");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("������ƽ����ת�ٶ�");
			Scanner s = new Scanner(System.in);
			String str = null;

			str = s.next();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}
			Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)?$");
			Matcher matcher = pattern.matcher((CharSequence) str);
			boolean result = matcher.matches();
			if (result) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("ֻ����������");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("��ЧԲƽ����ת�뾶");
			Scanner s = new Scanner(System.in);
			String str = null;
			str = s.next();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}
			Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)?$");
			Matcher matcher = pattern.matcher((CharSequence) str);
			boolean result = matcher.matches();
			if (result) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("ֻ����������");
			}

		}
		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("�����빫ת����");
			Scanner s = new Scanner(System.in);
			String str = null;

			str = s.next();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}
			if (str.length() > 0 && str.length() < 18) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("ֻ����������");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("������ƫ����e");
			Scanner s = new Scanner(System.in);
			String str = null;

			str = s.next();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}
			Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)?$");
			Matcher matcher = pattern.matcher((CharSequence) str);
			boolean result = matcher.matches();
			if (result) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("ֻ����������");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("������̰뾶b");
			Scanner s = new Scanner(System.in);
			String str = null;
			str = s.next();
			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher matcher = pattern.matcher((CharSequence) str);
			boolean result = matcher.matches();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}
			if (result) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("ֻ����������");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("������̰뾶a");
			Scanner s = new Scanner(System.in);
			String str = null;
			str = s.next();
			Pattern pattern = Pattern.compile("[0-9]+");
			Matcher matcher = pattern.matcher((CharSequence) str);
			boolean result = matcher.matches();
			if (str.equals("leave")) {
				leave = "leave";
				break;
			}
			if (result) {
				str_all += str + " ";
				System.out.println(str_all);
				break;
			} else {
				System.out.println("ֻ����������");
			}
		}

		if (leave.equals("leave"))
			return;
		
		method(str_all);
		System.out.println("��ӳɹ���");
		return;
	}

	public void method(String str) {
		FileWriter fw = null;
		try {
			// ����ļ����ڣ���׷�����ݣ�����ļ������ڣ��򴴽��ļ�
			File f = new File("satelliteData.txt");
			fw = new FileWriter(f, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		pw.println(str);
		pw.flush();
		try {
			fw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
