
public class FashionMagazineState implements MagazineState {
	  MagazineContext mc;

		public FashionMagazineState(MagazineContext mc) {
			this.mc = mc;
			}

	@Override
	public void read() {
	System.out.println("Reading Fashion Magazine");	
	}

}