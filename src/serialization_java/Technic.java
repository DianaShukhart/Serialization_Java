
package serialization_java;

public class Technic extends Microwave {

    private static final long serialVersionUID = 1L;
    private Microwave typeOfMicrowave;

    public Technic(int power, String name, boolean isSafe) {
        super(power, name, isSafe);
        this.typeOfMicrowave = null;

    }

  public void settypeOfMicrowave(Microwave typeOfMicrowave ) {
        this.typeOfMicrowave = typeOfMicrowave;
    }

    @Override
    public String toString() {
        return super.toString()+"Microwave{" + "typeOfMicrowave=" + typeOfMicrowave + '}';
    }

  

}
