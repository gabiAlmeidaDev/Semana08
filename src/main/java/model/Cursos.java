package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Data
@Getter
public class Cursos {
    private static Integer idcurso = 1;
    private static List<Cursos> cursos = new ArrayList<>();
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

    public static Cursos cadastrarCurso(Cursos curso) {
        curso.idcurso = obterProximoId();
        cursos.add(curso);
        return curso;
    }

    public static CharSequence getNomeCurso() {
        return null;
    }

    public static Cursos buscarPorId(Integer id) {
        return null;
    }
}
