package programacaoestruturada.repeticao;

public class EnquantoSentinela {

	public static void main(String[] args) {
	
		boolean flag = false;
		
		int rand = 0;
		
		while(!flag) {
			
			rand = (int) Math.round(Math.random()*100);
			
			System.out.println(rand);
			
			if(rand > 80) flag = false;
		}
	}
}
