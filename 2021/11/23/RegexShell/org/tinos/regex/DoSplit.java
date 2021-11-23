package org.tinos.regex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//罗瑶光
//2021/11/23
public class DoSplit{

	public List<String>splitRegex(String input, String split, String unSplit) {

		/*
		 * 
		 *  input ds, ds, ada \\，sd
		 * 
		 *  split= ,
		 *  unSplit= \
		 * 
		 *  output 
		 *  0  ds
		 *  1  ds
		 *  2  ada \，sd
		 * 
		 * 
		 * */
		//1
		//String string= input.replace(unSplit+ split,"");//这种方法会速度变慢。
		//.....

		List<String> list= new ArrayList<>();
		//2
		//for(int i= 0; i< input.length(); i++) {//这种方法复杂。
		//	...
		//}

		//3
		//String[] strings= input.split(split);
		//for(int i= 0; i< strings.length; i++) {//这种方法快一点点还是复杂。
		//	if(strings[i].contains(unSplit)) {//满足包含
		//		String string= strings[i].replace(unSplit,"");//满足末尾匹配
		//       ......
		//	}
		//	list.add();
		//}



		//ds, ds, ada \\，sd
		//ds, ds, ada 
		//sd

		//稍后设计为StringBuilder
		//现在家对面美林花苑小区有一种超声电流 驱鼠的噪音。持续了1个小时。让人心烦 忧郁。听了后，人右眼皮莫名的频繁跳动。
		//String connect= unSplit+ split;
		//String[] stringsU= input.split(connect);//这里是PCRE linux 通配正则，所以会将\定义为 关键字语法。
		String connect= "DetaConnect";
		input= input.replace(unSplit+ split, "DetaConnect");
		String[] stringsU= input.split(connect);//这里是PCRE linux 通配正则，所以会将\定义为 关键字语法。


		String temp= "";
		for(int i= 0; i< stringsU.length; i++) {
			String[] strings= stringsU[i].split(split);
			int begin= 0;
			int end= 0;
			if(temp.isEmpty()) {
				temp+= strings[strings.length- 1];
				begin= 0;
				end= strings.length- 1;
			}else {
				temp+= unSplit+ split+ strings[0];
				list.add(temp.toString());
				temp= "";
				begin= 1;
				end= strings.length;
			}
			for(int j= begin; j< end; j++) {
				list.add(strings[j]);	
			}
		}


		return list;
	}

	public static void main(String[] args) {
		String string= "ds, ds, ada \\,sd";
		List<String> output= new DoSplit().splitRegex(string, ",", "\\");
		Iterator<String> iterator= output.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
	}
}