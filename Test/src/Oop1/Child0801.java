package Oop1;

public class Child0801 extends Parent0801 {//parentクラス（親クラス）を継承。
	public String cs1 = "子クラスのメンバ変数が参照されました。";

	public Child0801() {
		System.out.println("自クラスのコンストラクタ（引数なし）が呼ばれました。");
	}

	public void cm() {
		System.out.println("子クラスのメソッドが呼ばれました。");
	}
}
