import java.io.*;

class iqoo {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Size : ");
                int size = Integer.parseInt(br.readLine());

                int arr[] = new int[size];

                for( int i = 0 ; i < arr.length ; i++ ){
                        arr[i] = Integer.parseInt(br.readLine());
                }

                for( int i = 0 ; i < arr.length ; i++ ){
                	int count = 0 ;
			for( int j = 2 ; j <= arr[i]/2 ; j++ ){
				if( arr[i] % j == 0 ){
					count++;
				}
			}
			if( count > 0 ){
				System.out.print(arr[i] + "\t")	;
			}
		}
                System.out.println();

        }

}

