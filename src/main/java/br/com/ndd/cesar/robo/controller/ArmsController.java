package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.models.Arms;
import br.com.ndd.cesar.robo.models.Elbow;
import br.com.ndd.cesar.robo.models.HeadInclination;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** Classe que vai receber as requisições http
 *
 * @Author	Cesar Henrique
 */

@RestController
@RequestMapping(value="/api/arms") //URI padrão para a API
public class ArmsController {
    private Arms arms = new Arms();

    @RequestMapping(method = RequestMethod.GET, value="/elbow")
    public Elbow elbowInclinationCurrent() {
        return arms.getElbow();
    }

    @RequestMapping(method = RequestMethod.PUT, value="/elbow/{value}")
    public Elbow elbowInclination(@PathVariable("value") Elbow value) {
        return arms.updateElbow(value);
    }
}
