package school.sptech.sprint1_nota1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioMedioController {

    @GetMapping("/ex-02/{numero}")
    public Boolean exercicioMedio(@PathVariable int numero) {
        Integer qtdDivisiveis = 0;

        for(int i = 1; i <= numero; i ++){
            if(numero %i == 0){
                qtdDivisiveis++;
            }
        }

        if(numero % 1 == 0 && numero % numero == 0 && qtdDivisiveis == 2){
            return true;
        }

        return false;
    }
}
