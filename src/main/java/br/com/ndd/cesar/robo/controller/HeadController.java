package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.models.Head;
import br.com.ndd.cesar.robo.util.HeadInclination;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/** Classe que vai receber as requisições http
 *
 * @Author	Cesar Henrique
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/head") //URI padrão para a API
public class HeadController {
    private Head head = new Head();

    @ApiOperation(value = "Informa a inclinação atual da cabeça")
    @RequestMapping(method = RequestMethod.GET, value="/inclination", produces="application/json")
    public HeadInclination HeadInclination() {
        return head.getHeadInclination();
    }

    @ApiOperation(value = "Atualiza a inclinação atual da cabeça")
    @RequestMapping(method = RequestMethod.PUT, value="/inclination/{value}", produces="application/json")
    public HeadInclination HeadInclination(@PathVariable("value") HeadInclination value) {
            return head.updateHeadInclination(value);
    }

    @ApiOperation(value = "Informa a rotação atual da cabeça")
    @RequestMapping(method = RequestMethod.GET, value="/rotation", produces="application/json")
    public int headRotation() {
        return head.getRotation();
    }

    @ApiOperation(value = "Atualiza a rotação atual da cabeça")
    @RequestMapping(method = RequestMethod.PUT, value="/rotation/{value}", produces="application/json")
    public int headRotation(@PathVariable("value") int value) {
        return head.updateHeadRotation(value);
    }

}

