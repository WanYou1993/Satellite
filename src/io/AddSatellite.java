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
		System.out.println("输入leave离开！");
		String str_all = "";
		String leave = "";
		while (true) {
			System.out.println("请输入卫星名称");
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
				System.out.println("名称格式不正确");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("请输入卫星编号");
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
				System.out.println("只能输入数字");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("请输入平均公转速度");
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
				System.out.println("只能输入数字");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("等效圆平均公转半径");
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
				System.out.println("只能输入数字");
			}

		}
		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("请输入公转周期");
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
				System.out.println("只能输入数字");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("请输入偏心率e");
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
				System.out.println("只能输入数字");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("请输入短半径b");
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
				System.out.println("只能输入数字");
			}
		}

		if (leave.equals("leave"))
			return;

		while (true) {
			System.out.println("请输入短半径a");
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
				System.out.println("只能输入数字");
			}
		}

		if (leave.equals("leave"))
			return;
		
		method(str_all);
		System.out.println("添加成功！");
		return;
	}

	public void method(String str) {
		FileWriter fw = null;
		try {
			// 如果文件存在，则追加内容；如果文件不存在，则创建文件
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
