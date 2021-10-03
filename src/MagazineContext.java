public class MagazineContext {

	MagazineState fashion;
	MagazineState sport;
	MagazineState entertainment;
	MagazineState tech;
	MagazineState students;
	MagazineState state;
	
	public MagazineContext()
	{
		fashion = new FashionMagazineState(this);
		sport = new SportMagazineState(this);
		entertainment = new EntertainmentMagazineState(this);
		tech = new TechMagazineState(this);
		students = new StudentsMagazineState(this);
	}
	
	public void read()
	{
		state.read();
	}
	
	void setState(MagazineState state) {
		this.state = state;
	}
	public MagazineState getState() {
        return state;
    }
	public MagazineState getFaMagazineState() {
        return fashion;
    }
	public MagazineState getSportMagazineState() {
        return sport;
    }
	public MagazineState getEntertMagazineState() {
        return entertainment;
    }
	public MagazineState getTechMagazineState() {
        return tech;
    }
	public MagazineState getStudentsMagazineState() {
        return students;
    }	
}
