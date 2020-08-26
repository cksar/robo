package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.models.Arms;
import br.com.ndd.cesar.robo.models.ElbowContraction;
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
    private Arms leftArm = new Arms();
    private Arms rightArm = new Arms();

    /** Informa a contração atual do cotovelo direito
     */
    @RequestMapping(method = RequestMethod.GET, value="/elbow/left")
    public ElbowContraction elbowContractionLeft() {
        return leftArm.getElbowContraction();
    }

    /** Atualiza a contração atual do cotovelo direito
     */
    @RequestMapping(method = RequestMethod.PUT, value="/elbow/left/{value}")
    public ElbowContraction elbowContractionLeft(@PathVariable("value") ElbowContraction value) {
        return leftArm.updateElbowContraction(value);
    }

    /** Informa a rotação atual do pulso direito
     */
    @RequestMapping(method = RequestMethod.GET, value="/wrist/left")
    public int wristRotationLeft() {
        return leftArm.getWristRotation();
    }

    /** Atualiza a rotação atual do pulso direito
     */
    @RequestMapping(method = RequestMethod.PUT, value="/wrist/left/{value}")
    public int wristRotationLeft(@PathVariable("value") int value) {
        return leftArm.updateWristRotation(value);
    }

    /** Informa a contração atual do cotovelo esquerdo
     */
    @RequestMapping(method = RequestMethod.GET, value="/elbow/right")
    public ElbowContraction elbowContractionRight() {
        return rightArm.getElbowContraction();
    }

    /** Atualiza a contração atual do cotovelo esquerdo
     */
    @RequestMapping(method = RequestMethod.PUT, value="/elbow/right/{value}")
    public ElbowContraction elbowContractionRight(@PathVariable("value") ElbowContraction value) {
        return rightArm.updateElbowContraction(value);
    }

    /** Informa a rotação atual do pulso esquerdo
     */
    @RequestMapping(method = RequestMethod.GET, value="/wrist/right")
    public int wristRotationRight() {
        return rightArm.getWristRotation();
    }

    /** Atualiza a rotação atual do pulso esquerdo
     */
    @RequestMapping(method = RequestMethod.PUT, value="/wrist/right/{value}")
    public int wristRotationRight(@PathVariable("value") int value) {
        return rightArm.updateWristRotation(value);
    }
}
