import java.util.*;
class Square{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of rows:");
		int row=sc.nextInt();
		int num=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j==1){
				System.out.print(num*num+" ");
				}else if(num%5==0){
					System.out.print(num+" ");
				}else{
				System.out.print(num+" ");
				}num++;
			}System.out.println();
		}
	}

}
