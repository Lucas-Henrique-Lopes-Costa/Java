package BuildAnArray;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // Resize it, if it is full => Ajustar, se estiver cheio
        if (items.length == count) {
            // Crate a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all already existing in the array
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            // Set the new "items"
            items = newItems;
        }

        // Add the new item at the end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // Validar o idex
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        // Mudar os item para esquerda para preecher o buraco
            // [10, 20, 30, 40]
            // index: 1 => 2 -> 1; 3 -> 2
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count --;
    }

    public int indexOf(int item) {
        // If you find it, return


        // Otherwise, return -1
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for(int i = 0; i < count; i++) {
            // Quando o contador é iniciado no valor de "0", ele retornará vazio
            System.out.println(items[i]);
        }
    }
}
