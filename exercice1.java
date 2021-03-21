package tp2;

import java.util.*;

public class exercice1 {

	public static boolean verif(int n) {
		String s = String.valueOf(n);
		if (s.length()!=4 ) {
			return false;
		}
		for (int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(s.charAt(i));
				if ((i!=j) && String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(j)))) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		VacheTaureau VT = new VacheTaureau(1234);
		System.out.println("le jeu a commencer");
		Scanner sc = new Scanner(System.in) ;
		while(!VT.gagne() && !VT.perdu()) {
			// 
			int val;
			do {
				System.out.println("yehdik het noumrou");
				val = sc.nextInt();
			}while(!verif(val));
			
			VT.propose(val);
			VT.etat();
		}
		if(VT.gagne()) {
			System.out.println("rbe7t yaatik essa7a");
		}else if(VT.perdu()){
			
			System.out.println("yaatik essa7a ama rak khsart ...");
			System.out.println("la solution etait : |"+VT.nSolution[0] +" | "+VT.nSolution[1] +" | "+VT.nSolution[2] +" | "+VT.nSolution[3] +" | ");
		}
	}

}
