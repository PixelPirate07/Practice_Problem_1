public class Prime{
	public static void main(String args[]){
		for(int i=1;i<=10;i++){
			int d=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					d++;
				}
			}
			if(d==2){
				System.out.println("Prime"+i);
			}
			else{
				System.out.println("Not Prime"+i);
			}
		}
	}
}	
				
