package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.models.Head;
import br.com.ndd.cesar.robo.models.HeadInclination;
import org.springframework.web.bind.annotation.*;

/** Classe que vai receber as requisições http
 *
 * @Author	Cesar Henrique
 */

@RestController
@RequestMapping(value="/api/head") //URI padrão para a API
public class HeadController {
    private Head head = new Head();

    /** Informa a inclinação atual da cabeça
     */
    @RequestMapping(method = RequestMethod.GET, value="/inclination")
    public HeadInclination headInclinationCurrent() {
        return head.getHeadInclination();
    }

    /** Atualiza a inclinação atual da cabeça
     */
    @RequestMapping(method = RequestMethod.PUT, value="/inclination/{value}")
    public HeadInclination HeadInclination(@PathVariable("value") HeadInclination value) {
            return head.updateHeadInclination(value);
    }

    /** Informa a rotação atual da cabeça
     */
    @RequestMapping(method = RequestMethod.GET, value="/rotation")
    public int headRotationCurrent() {
        return head.getRotation();
    }

    /** Atualiza a rotação atual da cabeça
     */
    @RequestMapping(method = RequestMethod.PUT, value="/rotation/{value}")
    public int headRotation(@PathVariable("value") int value) {
        return head.updateHeadRotation(value);
    }

}

