package src;

import javax.xml.transform.Source;

public class Aula39OO {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Vitor", 20, 'M');

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sex);

        Pessoa p2 = new Pessoa();

        p2.setNome("Lis");
        p2.setIdade(19);
        p2.setSex('F');

        System.out.println(p2.nome);
        System.out.println(p2.idade);
        System.out.println(p2.sex);

        Estudante e1 = new Estudante("estudante1", 15, 'M', "6ano");

        System.out.println(e1.nome);
        System.out.println(e1.idade);
        System.out.println(e1.sex);
        System.out.println(e1.turma);

        Estudante e2 = new Estudante(p1, "9ano");

        Estudante e3 = e2;

        System.out.println("Estudante2: " + e2.nome + " Hash: " + e2.hashCode());
        System.out.println("Estudante3: " + e3.nome + " Hash: " + e3.hashCode());
    }
}

class Pessoa {
    public String nome;
    public int idade;
    public char sex;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, char sex){
        this.nome = nome;
        this.idade = idade;
        this.sex = sex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

class Estudante extends Pessoa {
    public String turma;

    public Estudante(String nome, int idade, char sex, String turma){
        super(nome, idade, sex);
        this.turma = turma;
    }

    public Estudante(Pessoa pessoa, String turma) {
        super(pessoa.nome, pessoa.idade, pessoa.sex);
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
