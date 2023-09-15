import java.util.ArrayList;

public class Turma {
    private String nome;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(String nome, Disciplina disciplina){
        this.nome=nome;
        this.disciplina=disciplina;
        this.alunos = new ArrayList<Aluno>();
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina=disciplina;
    }

    public String getNome(){
        return nome;
    }
    public String getDisciplina(){
        return disciplina.getNome();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    public ArrayList<Aluno> mostrarAlunos(){
        return alunos;
    }
}
