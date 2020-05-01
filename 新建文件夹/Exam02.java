package exam02;
class Jordan{
	private String name;
	private String skill;
	private int number;
	private int champion;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill=skill;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getChampion() {
		return champion;
	}
	public void setChampion(int champion) {
		this.champion=champion;
	}
}
public class Exam02 {
 public static void main(String[]args) {
	 Jordan qiaodan=new Jordan();
	 qiaodan.setName("Jordan");
	 qiaodan.setSkill("ºóÑöÌøÍ¶");
	 qiaodan.setNumber(23);
	 qiaodan.setChampion(6);
	 System.out.println("Name:"+qiaodan.getName()+" Skill:"+qiaodan.getSkill()+"  Number:"+qiaodan.getNumber()+" Champion:"+qiaodan.getChampion());
 }
 
}
