package Big_O;

public class Main {

    // O(1) = CONSTANTE
    public void log(int[] numbers) {
        System.out.println(numbers[0]); // roda em um tempo constante
    }

    // O(n) = LINEAR
    public void log(int[] numbers, String[] names){
        // "n" representa o tamanho do Array

        for (int i = 0; i < numbers.length; i++) { // O(n)
            System.out.println(numbers[i]);
            // vai printar todos a os números até chegar no tamanho do Array
        }

        // Quando adicionarmos mais um "O(n)" se torna um "O(2n)"
        for (int number : numbers) {
            System.out.println(number);
        }

        // Já quando adicinamos esse, que é diferente do outro por ser uma String, você terá "O(n + m)" ou para simplificar (já que vai aumentar lineramente também) "O(n)"
        for (String name : names) {
            System.out.println(name);
        }
    }

    // O(n²) = Quadrantic
    public void log2(int[] numbers) {
        // Quando adicionarmos mais um "O(n)" dentro de um "for" ele se torna um "O(n²)" | Quanto mais você ir colando O(n) dentro maior ficará o expoente
        for (int first : numbers) { // O(n)
            for (int second : numbers) { // O(n)
                System.out.println(numbers);
            }
        }

        // se adicionar um "O(n)" fora do "for"
        for (int number : numbers) { // O(n)
            System.out.println(number);
        }
        // ele se tornará um "O(n + n²)"
    }
}