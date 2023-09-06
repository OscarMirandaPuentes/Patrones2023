package model;

public class Director {
	private Builder builder;
	private static Director director = null;
	
	public static Director getInstance() {
		if (director == null) {
			director = new Director();
		}
		return director;
	}

	public void changeBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void elegirtipo(String toy) {
		if (toy.equals("Funko")) {
			this.builder = new BuilderF();
		}
		else if(toy.equals("Lego")) {
			this.builder = new BuilderL();
		}
	}
	
	public void elegirGenero(String gen) {
		this.builder.producir(gen);
	}
	
	public Builder getBuilder() {
		return builder;
	}
}
