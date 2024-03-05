package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
public class Aluno {
    private static Integer idAluno = 1;
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

}
