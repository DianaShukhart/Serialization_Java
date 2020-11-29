
package serialization_java;


import java.io.Serializable;


public class Microwave implements Serializable {

  
    private static final long serialVersionUID = 1L;
      private final int power;
    private final String name;
    private final boolean isSafe;

    public Microwave(int power, String name, boolean isSafe) {
        this.power = power;
        this.name = name;
        this.isSafe = isSafe;
    }

    @Override
    public String toString() {
        return "Microwave{" + "power=" + power + ", name=" + name + ", isSafe=" + isSafe + '}';
    }

}

