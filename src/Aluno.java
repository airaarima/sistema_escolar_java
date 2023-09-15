import java.util.ArrayList;

public class Aluno{
    private String nome;
    private int idade;
    private String numRegistro;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Double> notas;
    
    public Aluno(String nome, int idade, String numRegistro){
        this.nome=nome;
        this.idade=idade;
        this.numRegistro=numRegistro;
        this.disciplinas= new ArrayList<Disciplina>();
        this.notas=new ArrayList<Double>();
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

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getNumRegistro(){
        return numRegistro;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void removerDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas;
    }

    public void adicionarNota(Double nota){
        notas.add(nota);
    }
    public void removerNota(Double nota){
        notas.remove(nota);
    }
    public ArrayList<Double> getNotas(){
        return notas;
    }
    public double calcularMedia(){
        double media=0;
        double somaNotas=0;
        for(Double nota:notas){
            somaNotas+=nota;
        }
        media=somaNotas/notas.size();
        return media;
    }
}