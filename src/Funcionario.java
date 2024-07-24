import java.io.Serializable;

public class Funcionario implements Autenticavel, Serializable, Comparable<Funcionario> {

    private String nome;
    private String cpf;
    private float salario;
    private String token;

    public Funcionario(String nome, String cpf, float salario, String token) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.token = token;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean autenticar() {
        return true;
    }

    @Override
    public int compareTo(Funcionario o) {
        return cpf.compareTo(o.getCpf());
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + salario +
                ", token='" + token + '\'' +
                '}';
    }
}
