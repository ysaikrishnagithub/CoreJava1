package socialmedia;

public class fruits {
	String name,color,tasty;
	fruits(String names1,String colors1,String tastys1){
		name=names1;
		color=colors1;
		tasty=tastys1;
	}
	fruits(fruits f){
		name=f.name;
		color=f.color;
		tasty=f.tasty;
	}
	String pandu() {
	return name+" "+color+" "+tasty;
	}
	
	

	public static void main(String[] args) {
		fruits fr = new fruits("mango", "yellow", "sweet");
		fruits fr1 = new fruits(fr);
		fruits fr2 = new fruits(fr1);
		System.out.println(fr.pandu());
		System.out.println(fr1.pandu());
		System.out.println(fr2.pandu());
	

	}

}
