package practice13.common;

public class Item {
	private String name;
	private int additionalDamage;

	public Item(String name,int additionalDamage){
		this.name=name;
		this.additionalDamage=additionalDamage;

	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		        this.name = name;
	}
	public int getAdditionalDamage() {
		return this.additionalDamage;
	}
	public void setAdditionalDamage(int additionalDamage) {
				this.additionalDamage=additionalDamage;
	}






}
/*
 * ★ common.Itemクラスを作成してください
 *
 * フィールド
 * 		name	:	String
 * 		additionalDamage	:	int
 * メソッド
 * 		各フィールドのアクセサ
 * コンストラクタ
 * 		name, additionalDamageに初期値を設定するコンストラクタ
 * 		上記2つを設定するための引数を持つ
 *
 *
 * ●getterメソッドの書き方
public 値を取り出すフィールドの型 getフィールド名() {
    return this.フィールド名;
}


● setterメソッドの書き方
public void setフィールド名(フィールドの型 任意の変数名) {
    this.フィールド = 任意の変数名;


    public class Cat {
    private String name;

    // getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }


 */