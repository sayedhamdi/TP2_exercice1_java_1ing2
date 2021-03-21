package tp2;

public class VacheTaureau {
	//attribut
	
	int [] nSolution;
	int [] nProp;
	int nTentatives;
	int nVache;
	int nTaureau;
	
	//constructeur
	public VacheTaureau(int v) {
		// v = 1234 // dima 4 chiffre
		// v / 1000 
		// r= v % 1000 => 234  / 100
		// 
		//mod w div 
		// 1234 => [1,2,3,4] => nSolution
		this.nSolution = new int[4];
		this.nProp = new int[4] ;
		this.nSolution[0] = v/1000;
		this.nSolution[1] = (v%1000)/100;
		this.nSolution[2] = (v%100)/10;
		this.nSolution[3] = (v%10);
		for (int i=0;i<4;i++) {
			this.nProp[i]=0;
		}
		this.nTaureau = this.nTentatives = this.nVache =0;
	}
	boolean gagne(){
		return this.nTaureau ==4 && this.nTentatives<10;

	}
	boolean perdu() {
		return (this.nTentatives==10 && this.nTaureau<4);
	}
	void propose(int val) {
		this.nProp[0] = val/1000;
		this.nProp[1] = (val%1000)/100;
		this.nProp[2] = (val%100)/10;
		this.nProp[3] = (val%10);
		this.nVache = 0;
		this.nTaureau = 0;
		this.nTentatives++;
		// 4561 nSolution = [4,5,6,1]
		// val 6241 => nProp = [6,2,4,1]
		for (int i=0;i<4;i++) {
			if(this.nSolution[i] == this.nProp[i]) {
				this.nTaureau++;
			}
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				if((this.nSolution[i] == this.nProp[j]) && i!=j) {
					this.nVache++;
				}
			}
		}
	}
	void etat() {
		System.out.println("_____________");
		for (int i=0;i<4;i++) {
			System.out.print(this.nProp[i]+ " | ");
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println("nVache : "+this.nVache);
		System.out.println("nTaureau: "+this.nTaureau);
		System.out.println("ntentative: "+this.nTentatives);
	}
	
}
