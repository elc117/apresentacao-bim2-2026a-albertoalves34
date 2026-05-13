import java.util.ArrayList;

public class Turma{
    private String professorNome;
    private String materia;
    private ArrayList<Aluno> alunos;

    public Turma(){
        this.professorNome = "";
        this.materia = "";
        this.alunos = new ArrayList<Aluno>();
    }
  
    public void setProfessorNome(String professorNome){
        this.professorNome = professorNome;
    }


     public void setMateria(String materia){
        this.materia = materia;
    }


    public String getProfessorNome(){
        return this.professorNome;
    }

     public String getMateria(){
        return this.materia;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public double mediaTurma(){
        double soma = 0.0;
        for (Aluno aluno : this.alunos){ 
           soma += aluno.getAlunoNota();
           }
    
        return soma / this.alunos.size();
    }


    public void imprimeAlunos(){
        for(Aluno aluno : this.alunos){
            System.out.println("-------------------------------");
            System.out.println("Nome: " + aluno.getAlunoNome());
            System.out.println("Nota: " + aluno.getAlunoNota());
            System.out.println("-------------------------------");
        }
    }

    public double taxaAprovacao(){
        double aprovados = 0.00;

        for(Aluno aluno : this.alunos){
            if(aluno.getAlunoNota() >= 7)
                aprovados ++;
        }

        return  aprovados / this.alunos.size();
    }

}
