package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
public class Aluno {
    private static Integer idAluno = 1;
    private static List<Aluno> alunos = new ArrayList<>();
    @Setter
    private String nomeAluno;
    @Setter
    private LocalDate dataNascimento;

    public static synchronized int obterProximoId() {
        return ++idAluno;
    }

    public Aluno(String nomeAluno, LocalDate dataNascimento) {
        this.nomeAluno = nomeAluno;
        this.dataNascimento = dataNascimento;
    }

    public static List<Aluno> getAluno() {
        List<Aluno> alunos = null;
        return alunos;
    }


    public static Aluno buscarPorId(Integer id) throws Exception {
        for (Aluno aluno : alunos) {
            if (aluno.getIdAluno().equals(id)) {
                return aluno;
            }
        }
        throw new Exception("O Aluno não foi encontrado!");
    }

    public static Aluno cadastrarAluno(Aluno aluno) {
        aluno.idAluno = obterProximoId();
        alunos.add(aluno);
        return aluno;
    }

    private Object getIdAluno() {
        return null;
    }
}
