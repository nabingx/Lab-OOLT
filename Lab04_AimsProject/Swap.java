package Lab04_AimsProject;

public class Swap {
	private DigitalVideoDisc o1;
	private DigitalVideoDisc o2;

	public void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		//DigitalVideoDisc tmp = o1;
		this.o1 = o2;
		//this.o2 = tmp;
		this.o2 = o1;
	}

	public DigitalVideoDisc getO1() {
		return o1;
	}

	public void setO1(DigitalVideoDisc o1) {
		this.o1 = o1;
	}

	public DigitalVideoDisc getO2() {
		return o2;
	}

	public void setO2(DigitalVideoDisc o2) {
		this.o2 = o2;
	}
}
