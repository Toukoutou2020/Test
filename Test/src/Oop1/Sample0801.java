package Oop1;

public class Sample0801 {
	public static void main(String[] args) {
		Child0801 child = new Child0801();//子クラスのインスタンスを生成。
		System.out.println(child.ps1);//親クラスのメンバ変数を参照。
		System.out.println(child.cs1);//子クラスのメンバ変数参照。
		child.pm();//親クラスのメソッドの呼び出し。
		child.cm();//子クラスのメソッドの呼び出し。
	}
}