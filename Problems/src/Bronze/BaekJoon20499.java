package Bronze;
import java.io.*;
import java.util.*;
public class BaekJoon20499 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"/");
		int K = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		if(K+A<D | D == 0) {
			System.out.println("hasu");
		}
		else {
			System.out.println("gosu");
		}
			
	}

}
