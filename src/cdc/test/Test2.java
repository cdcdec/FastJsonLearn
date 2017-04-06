package cdc.test;

import com.alibaba.fastjson.JSON;

import cdc.test.bean.Group;

public class Test2 {
	
	private static String strs="{'id':0,'name':'admin','users':[{'id':2,'name':'guest'},{'id':3,'name':'root'}]}";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tt2();
	}
	
	public static void tt2(){
		Group group = JSON.parseObject(strs, Group.class);
		System.out.println(group.getUsers().size());
	}

}
