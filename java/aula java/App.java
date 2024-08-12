public class App {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");

        Pessoa novaPessoa = new Pessoa(); // cria objeto

        novaPessoa.nome = "Pedro";
        novaPessoa.idade = 17;

        System.out.println(novaPessoa.nome);
        System.out.println(novaPessoa.idade);

        Aluno novoAluno = new Aluno();

        novoAluno.matricula = "15879";
        novoAluno.nome = "pedro";
        novoAluno.sexo = "masculino";
        novoAluno.idade = 17;
        novoAluno.email = "paulo123";

        System.out.println(novoAluno.matricula);
        System.out.println(novoAluno.nome);
        System.out.println(novoAluno.sexo);
        System.out.println(novoAluno.idade);
        System.out.println(novoAluno.email);

        Aula novAula = new Aula();

        novAula.nomemateria = "java";
        novAula.nomeprofessor = "thiago";
        novAula.periodo = 3;

        System.out.println(novAula.nomemateria);
        System.out.println(novAula.nomeprofessor);
        System.out.println(novAula.periodo);

    }
}