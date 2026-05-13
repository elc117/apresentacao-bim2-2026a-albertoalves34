public class Aluno{
    private String nome;
    private Double nota;

    public Aluno(){
        this.nome = "";
        this.nota = -1.00;
    }
 
    public void setAlunoNome(String nome){ 
        this.nome = nome;
    }

     public void setAlunoNota(double nota){ 
        this.nota = nota;
    }

    public String getAlunoNome(){
        return this.nome;
    }
     public double getAlunoNota(){
        return this.nota;
    }

}
