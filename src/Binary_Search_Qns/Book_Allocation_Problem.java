package Binary_Search_Qns;
import java.util.*;
public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nob = sc.nextInt(); //Number of Books
		int nos = sc.nextInt(); //Number of student
		int[] pages = new int[nob];
		for(int i=0; i<nob; i++) {
			pages[i] = sc.nextInt();
		}
		Arrays.sort(pages);
		System.out.println(minimumStu(pages, nos));
	}
	
	public static int minimumStu(int[] pages, int nos) {
		int lo = 0;
		int hi = 0;
		for(int i=0; i<pages.length; i++) {
			hi += pages[i];
		}
		int ans = 0;
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(isPossible(pages, nos, mid)) {
				ans = mid;
				hi = mid - 1;
			}
			else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	private static boolean isPossible(int[] pages, int nos, int mid) {
		// TODO Auto-generated method stub
		int student = 1;
		int readPage = 0;
		
		for(int i=0; i<pages.length;) {
			if(readPage + pages[i] <= mid) {
				readPage += pages[i];
				i++;
			}
			else {
				readPage = 0;
				student++;
			}
			if(student > nos) return false;
		}
		return true;
	}

}
