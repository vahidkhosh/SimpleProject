package simpleExample;

public class Annuncio {
	
	public String displayAnnuncio(){
		
		String str= "AAA";
		  str+="BBB";
		
		for(int i=0 ; i<5 ; i++){
			str+="  "+i;
		}
		
		return str;
	}

}
