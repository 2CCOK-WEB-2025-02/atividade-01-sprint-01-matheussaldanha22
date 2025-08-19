package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        List<Integer> sequencia = new ArrayList<>();
        int ultimaPosicao = 0;
        int posicaoAtual = 1;

        int enesimo = 0;
        int soma = 0;

        for (int i = 0; i <= n; i++) {
            sequencia.add(ultimaPosicao);
            soma += ultimaPosicao;

            if (i == n) {
                enesimo = ultimaPosicao;
            }

            int somaFibo = ultimaPosicao + posicaoAtual;
            ultimaPosicao = posicaoAtual;
            posicaoAtual = somaFibo;
        }

        return new ExercicioDificilResponse(enesimo, soma);
    }

}
