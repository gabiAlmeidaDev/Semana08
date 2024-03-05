package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
public class Cursos {
    private static Integer idcurso = 1;
    @Setter
    private String nomeCurso;
    @Setter
    private String descricao;
    private Integer cargaHoraria;

    public static synchronized int obterProximoId() {

        return ++idcurso;
    }
    public Cursos(String nomeCurso, String descricao, Integer cargaHoraria) {
        this.nomeCurso = nomeCurso;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
}
