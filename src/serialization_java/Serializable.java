
package serialization_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable {

    public static void main(String[] args) {
        Microwave[] type = new Microwave[2];//массив техники

        Technic microwave = new Technic(1000, "Name Of Microwave", true);
        Microwave samsung = new Microwave(500, "Samsung", true);
        microwave.settypeOfMicrowave(samsung);
        type[0] = microwave;
        type[1] = samsung;


        try {
            // Сброс данных объекта staff в файл (сериализация данных)
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Technic.dat"));
            out.writeObject(type);
            out.close();

            // Чтение сериализованных данных из файла в объект (десериализация данных)
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Technic.dat"));
            Microwave[] newType = (Microwave[]) in.readObject(); // Новый список
            in.close();

            // Вывод на экран массива объектов newStaff
            for (Microwave e : newType) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
