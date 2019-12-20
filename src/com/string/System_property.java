package com.string;
//util:工具
import java.util.*;

public class System_property {

	public static void main(String[] args) {
		Properties xtsx=System.getProperties();//stxs:系统属性
		//System.out.println(xtsx);
		Set<String> sxm=xtsx.stringPropertyNames();//sxm：属性名
		//foreach循环读出属性集里的内容
		for (String key : sxm) {
			String value=System.getProperty(key);
			System.out.println(key+"-->"+value);
		}

	}

}
