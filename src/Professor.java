import java.util.ArrayList;

public class Professor {
    private String nome;
    private int idade;
    private String numRegistro;
    private double salario;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, int idade, String numRegistro, double salario){
        this.nome=nome;
        this.idade=idade;
        this.numRegistro=numRegistro;
        this.salario=salario;
        this.disciplinas= new ArrayList<Disciplina>();
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public void setNumRegistro(String numRegistro){
        this.numRegistro=numRegistro;
    }
    public void setSalariosalario(double salario){
        this.salario=salario;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getNumRegistro(){
        return numRegistro;
    }
    public double Salario(){
        return salario;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void removerDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
}