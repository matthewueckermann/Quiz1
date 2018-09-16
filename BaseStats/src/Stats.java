import java.util.Scanner;
public class Stats {
	private int AB; // At bats
	private int H; // Hits
	private int _2B; // doubles
	private int _3B; // triples
	private int HR; // Home Runs
	private int R;  // Runs
	private int BB; // Walks
	private String name;

	Scanner stdin = new Scanner(System.in); 
	
	public Stats() {
		System.out.print("Please enter the players name: ");
		this.name = stdin.nextLine();
		System.out.print("Please enter the number of at bats: ");
		this.AB = stdin.nextInt(); 
		System.out.print("Please enter the number of hits: ");
		this.H = stdin.nextInt();
		System.out.print("Please enter the number of doubles: ");
		this._2B = stdin.nextInt(); 
		System.out.print("Please enter the number of triples: ");
		this._3B = stdin.nextInt(); 
		System.out.print("Please enter the number of Home Runs: ");
		this.HR = stdin.nextInt(); 
		System.out.print("Please enter the number of runs: ");
		this.R = stdin.nextInt();
		System.out.print("Please enter the number of walks: ");
		this.BB = stdin.nextInt(); 
	}
	
	public double getBA() {
		return 1.0*this.H/this.AB;
	}
	
	public double getOBP() {
		return 1.0*(this.H+this.BB)/(this.AB+ this.BB);
	}
	
	public double getSLG() {
		return (1.0*((this.H-this._2B-this._3B-this.HR)+2*this._2B+3*this._3B+4*this.HR))/this.AB;
	}
	
	public double getOPS() {
		return getSLG()+ getOBP();
	}
	
	public double getTB() {
		return ((H-_2B-_3B-HR)+2*_2B+3*_3B+4*HR);
	}
	
	public double getOBS() {
		return getSLG() + getOBP();
	}
}


