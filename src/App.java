import java.util.Arrays;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {

        int array[] = {2,6,9,3,0};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Funcionario funcionarios[] = {
                new Funcionario("João", "333.333.333-03", 2000, "123"),
                new Funcionario("Ana", "222.222.222-02", 3000, "654"),
                new Funcionario("Zé", "111.111.111-01", 2500, "362")
        };

        Comparator<Funcionario> comparadorFuncionario = new Comparator<Funcionario>() {
            @Override
            public int compare(Funcionario o1, Funcionario o2) {
                return (int) (o1.getSalario()-o2.getSalario());
            }
        };

        Arrays.sort(funcionarios, comparadorFuncionario);
        System.out.println(Arrays.toString(funcionarios));

    }

    public boolean autenticar(Autenticavel autenticavel){
        return autenticavel.autenticar();
    }

}
