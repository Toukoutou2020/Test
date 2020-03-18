package Oop1;
//Parent.java親クラス
public class Parent{
	/**姓*/
	public String fimilyName;
	/**名*/
	private String givenName;
	/**財産*/
	protected int money;
	/**メソッド*/
	public String hello() {
		System.out.println("say hello");
		return "123";
	}
}
