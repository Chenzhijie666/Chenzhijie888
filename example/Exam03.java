package exam03;
class Hero{
	public void speak() {
		System.out.println("ȫ��������");
	}
}
class Ake extends Hero{
	public void speak() {
		System.out.println("����ҫ�ۣ��Һܱ�Ǹ��");
	}
}
class Sunshangxiang extends Hero{
	public void speak() {
		System.out.println("��С��ݵ���ͳͳ������");
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
