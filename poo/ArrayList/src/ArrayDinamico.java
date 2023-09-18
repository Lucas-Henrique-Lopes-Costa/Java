import java.util.ArrayList;
import java.util.Collections;

public class ArrayDinamico {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayDinamico = new ArrayList<String>();

        arrayDinamico.add("A");
        arrayDinamico.add("C");
        arrayDinamico.add("B");

        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        // Usando o for each
        for (String item : arrayDinamico) { // Cada item do arrayDinamico será armazenado na variável item
            // String item = arrayDinamico.get(i);
            System.out.println(item);
        }

        System.out.println("Último Elemento: " + arrayDinamico.get(arrayDinamico.size() - 1));

        System.out.println("Removendo o último elemento: " + arrayDinamico.remove(arrayDinamico.size() - 1));

        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        // Ordenando
        Collections.sort(arrayDinamico);
        for (String item : arrayDinamico) {
            System.out.println(item);
        }

        System.out.println("Removendo Tudo");
        arrayDinamico.clear();
    }
}
