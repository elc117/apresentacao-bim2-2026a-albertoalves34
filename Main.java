public class Teste{
    public static void main (String[] arguments){
        
        Turma turma = new Turma();

        Aluno a1 = new Aluno();
        a1.setAlunoNome("Nillo");
        a1.setAlunoNota(8.0);

        Aluno a2 = new Aluno();
        a2.setAlunoNome("Emilio");
        a2.setAlunoNota(6.0);

        turma.addAluno(a1);
        turma.addAluno(a2);

        turma.imprimeAlunos();
        System.out.println("Média da Turma: "+turma.mediaTurma());
        System.out.println(("Taxa de Aprovação: "+turma.taxaAprovacao() * 100) + "%");
    }
}
