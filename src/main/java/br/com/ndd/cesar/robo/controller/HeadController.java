package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.models.Head;
import br.com.ndd.cesar.robo.models.HeadInclination;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** Classe que vai receber as requisições http
 *
 * @Author	Cesar Henrique
 */

@RestController
@RequestMapping(value="/api") //URI padrão para a API
public class HeadController {
    private Head head = new Head();

    /** Informa a inclinação atual da cabeça
     */
    @GetMapping("/head/current")
    public HeadInclination headCurrent() {
        return head.getHeadInclinationCurrent();
    }
}
