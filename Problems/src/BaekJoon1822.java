import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BaekJoon1822 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("C:\\ssafy\\BaekJoon\\Problems\\src\\input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0; // 집합 공통 요소 세는 변수
		int count2 =0;
		int temp = 0; // 오름차순 정렬시 임시 저장소
		int a = Integer.parseInt(st.nextToken()); //집합 A의 원소 개수
		int b = Integer.parseInt(st.nextToken()); //집합 B의 원소 개수
		int A[]=new int[a]; // 집합 A 배열
		int B[]=new int[b]; // 집합 B 배열
		int answer[]=new int[b]; //차집합 배열
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<a;i++) { //집합 A 속 채우기
			A[i]=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<b;i++) {//집합 B 속 채우기		
			B[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(A[i]!=B[j]) {							
					count2++;
				}
				if(count2==b) {
					answer[count]=A[i];
					count++;
				}
			} //B에 속하지 않는 원소를 찾고 출력 배열 answer에 넣기
			count2=0;
		}
		if(count==0) {
			System.out.println("0");
		}
		else {
			for(int i=0; i<count-1;i++) {
				for(int j=0; j<count-1;j++) {
					if(answer[j]>answer[j+1]) {
						temp = answer[j];
						answer[j] = answer[j+1];
						answer[j+1] = temp;
					}
				}
			}
			System.out.println(count);
			for(int k=0;k<count;k++) {
				System.out.print(answer[k]+" ");
			}
		}
	}
}