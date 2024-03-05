package controller;

import model.Cursos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CursosService;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursosController {

    private final CursosService cursosService;

    public CursosController(CursosService cursosService) {
        this.cursosService = cursosService;
    }


    @GetMapping
    public List<Cursos> get() {
        return cursosService.buscarCurso();
    }

    @PostMapping
    public Cursos post(@RequestBody Cursos curso) throws Exception {
        return cursosService.cadastrarCurso(curso);
    }

    @PostMapping("/{cursoId}/matricular")
    public ResponseEntity<?> matricularAluno(@PathVariable("cursoId") Integer cursoId, @RequestBody Integer alunoId) {
        try {
            cursosService.matricularAluno(cursoId, alunoId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
