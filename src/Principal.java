public class Principal {
    public static void main(String[] args){
        Aluno maria = new Aluno("Maria", 22, "2023-1038");
        Aluno aira = new Aluno("Aira", 21, "2023-2038");
        Aluno david = new Aluno("David", 27, "2023-3038");

        Professor guanabara = new Professor("Gustavo Guanabara", 46, "G-2023001", 3500);
        Professor joana = new Professor("Joana", 38, "J-2023002", 3500);

        Disciplina d1 = new Disciplina("Logica de Programação", "D01-LO", 150, guanabara);
        Disciplina d2 = new Disciplina("HTML e CSS", "D02-HTCS", 150, joana);
        Disciplina d3 = new Disciplina("JavaScript", "D03-JS", 150, joana);

        Turma tA = new Turma("Turma A", d3);

        maria.adicionarDisciplina(d3);
        maria.adicionarNota(8.3);
        maria.adicionarNota(9.0);
        System.out.println(maria.getNome()+"\n"+maria.getIdade()+" anos\n"+maria.getNumRegistro());
        for(Disciplina disciplina:maria.getDisciplinas()){
            System.out.println(disciplina.getNome());
        }
        System.out.println("A média final de "+maria.getNome()+" é: "+maria.calcularMedia());
        System.out.println("-----------------------");

        
        aira.adicionarDisciplina(d1);
        aira.adicionarDisciplina(d3);
        System.out.println(aira.getNome()+"\n"+aira.getIdade()+" anos\n"+aira.getNumRegistro());
        for(Disciplina disciplina:aira.getDisciplinas()){
            System.out.println(disciplina.getNome());
        }
        System.out.println("-----------------------");


        david.adicionarDisciplina(d2);
        david.adicionarDisciplina(d3);
        System.out.println(david.getNome()+"\n"+david.getIdade()+" anos\n"+david.getNumRegistro());
        for(Disciplina disciplina:david.getDisciplinas()){
            System.out.println(disciplina.getNome());
        }
        System.out.println("-----------------------");

        tA.adicionarAluno(maria);
        tA.adicionarAluno(aira);
        tA.adicionarAluno(david);
        System.out.println("A disciplina de "+tA.getDisciplina()+" é ministrada na "+tA.getNome()+", composta pelo seguintes alunos: ");
        for(Aluno aluno:tA.mostrarAlunos()){
            System.out.println("Nome: "+aluno.getNome()+" - Matrícula: "+aluno.getNumRegistro());
        }

    }
}
