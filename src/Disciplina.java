public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(String nome, String codigo,int cargaHoraria,Professor professor){
        this.nome=nome;
        this.codigo=codigo;
        this.cargaHoraria=cargaHoraria;
        this.professor=professor;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public void setNome(int cargaHoraria){
        this.cargaHoraria=cargaHoraria;
    }
    public void setProfessor(Professor professor){
        this.professor=professor;
    }

    public String getNome(){
        return nome;
    }
    public String getCodigo(){
        return codigo;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public Professor getProfessor(){
        return professor;
    }
}
