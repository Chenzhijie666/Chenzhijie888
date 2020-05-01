package exam03;
class Hero{
	public void speak() {
		System.out.println("全军出击！");
	}
}
class Ake extends Hero{
	public void speak() {
		System.out.println("生而耀眼，我很抱歉。");
	}
}
class Sunshangxiang extends Hero{
	public void speak() {
		System.out.println("大小姐驾到！统统闪开！");
	}
}
public class Exam03 {
  public static void main(String[]args) {
	  Hero a=new Ake();
	  Hero b=new Sunshangxiang();
	  Hero c=new Hero();
	  a.speak();
	  b.speak();
	  c.speak();
	  
  }
}
