package oef2;

public class Kaart {
	
	private Ranking rank;
	private Soort soort;
	
	public Kaart(Ranking rank, Soort soort) {
		setRank(rank);
		setSoort(soort);
	}
	
	public Ranking getRank() {
		return rank;
	}

	public void setRank(Ranking rank) {
		this.rank = rank;
	}

	public Soort getSoort() {
		return soort;
	}

	public void setSoort(Soort soort) {
		this.soort = soort;
	}

	@Override
	public String toString() {
		return this.soort.name().substring(0, 1) + this.soort.name().substring(1).toLowerCase() + " " + this.rank.name().toLowerCase();
	}
}
