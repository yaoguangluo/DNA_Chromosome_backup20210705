package org.tinos.regex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//������
//2021/11/23
public class DoSplit{

	public List<String>splitRegex(String input, String split, String unSplit) {

		/*
		 * 
		 *  input ds, ds, ada \\��sd
		 * 
		 *  split= ,
		 *  unSplit= \
		 * 
		 *  output 
		 *  0  ds
		 *  1  ds
		 *  2  ada \��sd
		 * 
		 * 
		 * */
		//1
		//String string= input.replace(unSplit+ split,"");//���ַ������ٶȱ�����
		//.....

		List<String> list= new ArrayList<>();
		//2
		//for(int i= 0; i< input.length(); i++) {//���ַ������ӡ�
		//	...
		//}

		//3
		//String[] strings= input.split(split);
		//for(int i= 0; i< strings.length; i++) {//���ַ�����һ��㻹�Ǹ��ӡ�
		//	if(strings[i].contains(unSplit)) {//�������
		//		String string= strings[i].replace(unSplit,"");//����ĩβƥ��
		//       ......
		//	}
		//	list.add();
		//}



		//ds, ds, ada \\��sd
		//ds, ds, ada 
		//sd

		//�Ժ����ΪStringBuilder
		//���ڼҶ������ֻ�ԷС����һ�ֳ������� �����������������1��Сʱ�������ķ� ���������˺�������ƤĪ����Ƶ��������
		//String connect= unSplit+ split;
		//String[] stringsU= input.split(connect);//������PCRE linux ͨ���������ԻὫ\����Ϊ �ؼ����﷨��
		String connect= "DetaConnect";
		input= input.replace(unSplit+ split, "DetaConnect");
		String[] stringsU= input.split(connect);//������PCRE linux ͨ���������ԻὫ\����Ϊ �ؼ����﷨��
		String temp= "";
	    int postFix= 0;
		for(int i= 0; i< stringsU.length; i++) {
			String[] strings= stringsU[i].split(split);
			postFix= strings.length;
			int begin= 0;
			int end= 0;
			if(temp.isEmpty()) {
				temp+= strings[strings.length- 1];
				begin= 0;
			}else {
				temp+= unSplit+ split+ strings[0];
				list.add(temp.toString());
				temp= strings[strings.length- 1]; //��������ĩβ�Ĳ�����
				begin= 1;
			}
			end= strings.length- 1;
			for(int j= begin; j< end; j++) {
				list.add(strings[j]);	
			}
		}
		if(!temp.isEmpty()&& 1!= postFix) {
			list.add(temp);	
		}
		return list;
	}

	public static void main(String[] args) {
		//String string= "ds, ds, ada \\,sd, ada \\\\,sd";
		//String string= "d\\, d,s, ada \\,sd, ada \\\\,sd";
		String string= "ds, ds, ada \\,sd, ada \\\\,s,d";
		List<String> output= new DoSplit().splitRegex(string, ",", "\\");
		Iterator<String> iterator= output.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
	}
}