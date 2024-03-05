package service;

import model.Cursos;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CursosService {

    public Cursos cadastrarCurso(Cursos curso) throws Exception {
        if (validar(curso)) {
            return Cursos.cadastrarCurso(curso);
        }
        return null;
    }

    private boolean validar(Cursos curso) throws Exception {
        if (!StringUtils.hasText(curso.getNomeCurso())) {
            throw new Exception("O nome do curso é obrigatório!");
        }
        return true;
    }

    public List<Cursos> buscarCurso() {
        return (List<Cursos>) Cursos.getNomeCurso();
    }

    public Cursos buscarPorId(Integer id) throws Exception {
        return Cursos.buscarPorId(id);
    }

    public void matricularAluno(Integer cursoId, Integer alunoId) {
    }
}
