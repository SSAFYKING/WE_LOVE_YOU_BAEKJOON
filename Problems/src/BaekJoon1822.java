import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class BaekJoon1822 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken()); //집합 A의 원소 개수
		int b = Integer.parseInt(st.nextToken()); //집합 B의 원소 개수
		int count = a; // A의 원소 개수를 담고 있다가 이후 공통 원소를 뺴준다.
		int A[]=new int[a]; // 집합 A 배열
		int B[]=new int[b]; // 집합 B 배열
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<a;i++) { //집합 A 속 채우기
			A[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A); // 출력을 위해 오름차순 정렬
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<b;i++) {//집합 B 속 채우기		
			B[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<a;i++) { //A와 B를 탐색하면서 같은 값 찾을시 0으로 바꿔줌.
			for(int j=0;j<b;j++) {
				if(A[i]==B[j]) {							
					A[i]=0;
					count--; // 공통 원소 찾을시 count감소 -> 최종적으로 차집합 원소 개수
					break; // 시간 감소를 위해 탐색 완료시 j for문 탈출
				}
			} 
		}
		if(count==0) { // 예외 처리 차집합 원소가 없을시 0출력
			System.out.println('0');
		}
		else {
			System.out.println(count); // 차집합 원소 개수 출력
			for(int j =0; j<a;j++) { // 0으로 바꾼 공통 원소 제외한 A의 원소 출력
				if(A[j]!=0){
				System.out.print(A[j]+" ");
				}
			}
		}
	}
}