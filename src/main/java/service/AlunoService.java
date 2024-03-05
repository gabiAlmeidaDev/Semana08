package service;

import model.Aluno;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AlunoService {

    public Aluno cadastrarAluno(Aluno aluno) throws Exception {
        if (validar(aluno)) {
            return Aluno.cadastrarAluno(aluno);
        }
        return null;
    }

    private boolean validar(Aluno aluno) throws Exception {
        if (!StringUtils.hasText(aluno.getNomeAluno())) {
            throw new Exception("O nome do aluno é obrigatório!");
        }
        if (aluno.getDataNascimento() == null) {
           throw new Exception("A data de nascimento é obrigatória!");
        }
        return true;
    }

    public List<Aluno> buscarAlunos() {
        return Aluno.getAluno();
    }
    public Aluno buscarPorId (Integer id) throws Exception {
        return Aluno.buscarPorId(id);
    }
}
