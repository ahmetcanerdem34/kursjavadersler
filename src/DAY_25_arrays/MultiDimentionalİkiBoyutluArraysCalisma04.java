package DAY_25_arrays;

public class MultiDimentional›kiBoyutluArraysCalisma04 {
	
	public static void main(String[] args) {
		
		
		int[][] tablo=new int[3][3];
		
		for (int i = 0; i < tablo.length; i++) {
			
			for (int j = 0; j < tablo[i].length; j++) {
				
				
				if(i==0) {
					
					tablo[i][j]=1;
					
				}if(j==1) {
					
					tablo[i][j]=2;
					
				}if(i==1) {
					
					tablo[i][j]=8;
					
				}if(j==2) {
					
					tablo[i][j]=3;
				}if(i==2) {
					
					tablo[i][j]=7;
					
				}if(i==1 && j==1) {
					
					tablo[i][j]=9;
					
				}if(i==1 && j==2) {
					
					tablo[i][j]=4;
					
				}if(i==2 && j==2) {
					
					tablo[i][j]=5;
					
				}if(i==2 && j==1) {
					
					tablo[i][j]=6;
				}
			}
			
		}
for (int i = 0; i < tablo.length; i++) {
			
			for (int j = 0; j < tablo[i].length; j++) {
				
				
				System.out.print(tablo[i][j]+" ");
		}
		System.out.println();
	}

}
}