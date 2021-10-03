public class MagazineMain {

	public static void main(String[] args) {
	
		MagazineContext m = new MagazineContext();
		
		m.setState(new FashionMagazineState(m));
		m.read();
		
		m.setState(new TechMagazineState(m));
		m.read();
		
		m.setState(new SportMagazineState(m));
		m.read();
		
		m.setState(new EntertainmentMagazineState(m));
		m.read();
		
		m.setState(new StudentsMagazineState(m));
		m.read();
	}
}
