package ifelsecondition;

public class arrayconcept {
	
	private static void method() {
		
		String [] playlist1= new String[5];
		
		playlist1[0]= "Ar Rahman Songs";
		playlist1[1]= "Yuvan Hits";
		//songName[2]= "Song3";
		//songName[3]= "Song4";
		//songName[4]= "Song5";
		
		System.out.println(playlist1[0]);
		System.out.println(playlist1[1]);
		//System.out.println(songName[2]);
	}
	public static void main(String [] args) {
		arrayconcept obj1= new arrayconcept();
		obj1.method();
	}
}
