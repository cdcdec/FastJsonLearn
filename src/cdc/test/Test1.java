package cdc.test;

import com.alibaba.fastjson.JSON;

import cdc.test.bean.Group;
import cdc.test.bean.User;

public class Test1 {
	public static void main(String[] args) {
		tt1();
	}
	
	public static void tt1(){
		Group group = new Group();
		group.setId(0L);
		group.setName("admin");

		User guestUser = new User();
		guestUser.setId(2L);
		guestUser.setName("guest");

		User rootUser = new User();
		rootUser.setId(3L);
		rootUser.setName("root");

		group.getUsers().add(guestUser);
		group.getUsers().add(rootUser);

		String jsonString = JSON.toJSONString(group);
		//{"id":0,"name":"admin","users":[{"id":2,"name":"guest"},{"id":3,"name":"root"}]}
		System.out.println(jsonString);
	}

}
