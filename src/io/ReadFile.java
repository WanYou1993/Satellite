package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadFile {

    public static void readTxtFile(String filePath){
        try {
                String encoding="GBK";
                File file=new File(filePath);
                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
                    InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file),encoding);//���ǵ������ʽ
                    BufferedReader bufferedReader = new BufferedReader(read);
                    String lineTxt = null;
                    System.out.println("�������ǲ���:\r\n");
                    while((lineTxt = bufferedReader.readLine()) != null){
                        System.out.println(lineTxt);
                    }
                    read.close();
        }else{
            System.out.println("�Ҳ���ָ�����ļ�");
        }
        } catch (Exception e) {
            System.out.println("��ȡ�ļ����ݳ���");
            e.printStackTrace();
        }
     
    }
     
    public static void main(String argv[]){
        String filePath = "satelliteData.txt";
        readTxtFile(filePath);
        AddSatellite abc = new AddSatellite();
        
        while(true){
        	Scanner s = new Scanner(System.in);
            String str = null;
            str = s.next();
        	if(str.equals("add")){
        		abc.Add();
        	}else{
        		System.out.println("����add�������\r\n");
        	}
        }
        
    }
     
     
 
}