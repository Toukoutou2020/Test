package Oop1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<String> datas = new ArrayList<>();
		datas.add("u1");
		datas.add("u3");
		datas.add("u2");
		System.out.println(datas);//[u1,u3,u2]
		Collections.sort(datas);
		System.out.println(datas);//[u1,u2,u3]
	}
}
