package Oop1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		List<String> datas = new ArrayList<>();
		datas.add("u1");
		datas.add("u3");
		datas.add("u2");
		System.out.println(datas);//[u1,u3,u2]
		//匿名（とくめい）クラス
		//collections.sort(datas,new comparator<String>(){
		//      @overide
		//       public int compare(string t,string t1){
		//			return t2.compareTo(t1);
		//		}
		//});
		//このラムダ式をよく理解してください。
		Collections.sort(datas,(t1, t2) ->{
			return t2.compareTo(t1);
		});
		System.out.println(datas);//[u3,u2,u1]
	}
}
