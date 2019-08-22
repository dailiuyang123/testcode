package com.mycode.testcode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestcodeApplicationTests {

	@Value("#{'${UnMessageUsercodes}'.split(',')}")
	private List<String> iplist;

	@Test
	public void contextLoads() {
		System.out.println("hello world");
		System.out.println(iplist.size());
		for (String s : iplist) {
			System.out.println(s);
			if(s.equals("12081")){
				continue;
			}
			System.out.println(s);
		}
		List list=new ArrayList();
	}

}
