import classes.Pessoa;

public class GetSet {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.getNome());
        pessoa.setNome("João");
        System.out.println(pessoa.getNome());

        System.out.println(pessoa.getIdade());
        pessoa.setIdade(20);
        System.out.println(pessoa.getIdade());

        System.out.println(pessoa.getAltura());
        pessoa.setAltura(1.80);
        System.out.println(pessoa.getAltura());
    }
}
