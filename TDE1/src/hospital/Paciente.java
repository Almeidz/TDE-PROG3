package hospital;

public class Paciente {
    private int id;
    private String nome;
    private double peso;
    private double altura;
    private int sexo; // 1 para masculino, 2 para feminino, por exemplo

    public Paciente(int id, String nome, double peso, double altura, int sexo) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public int getSexo() { return sexo; }
    public void setSexo(int sexo) { this.sexo = sexo; }

    @Override
    public String toString() {
        return "Paciente { ID: " + id + ", Nome: " + nome + ", Peso: " + peso + ", Altura: " + altura + ", Sexo: " + (sexo == 1 ? "Masculino" : "Feminino") + " }";
    }
}