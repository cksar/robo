package br.com.ndd.cesar.robo.controller;

import br.com.ndd.cesar.robo.models.Arms;
import br.com.ndd.cesar.robo.util.ElbowContraction;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @ApiOperation(value = "Informa a contração atual do cotovelo direito")
    @RequestMapping(method = RequestMethod.GET, value="/elbow/left", produces="application/json")
    public ElbowContraction elbowContractionLeft() {
        return leftArm.getElbowContraction();
    }

    @ApiOperation(value = "Atualiza a contração atual do cotovelo direito")
    @RequestMapping(method = RequestMethod.PUT, value="/elbow/left/{value}", produces="application/json")
    public ElbowContraction elbowContractionLeft(@PathVariable("value") ElbowContraction value) {
        return leftArm.updateElbowContraction(value);
    }

    @ApiOperation(value = "Informa a rotação atual do pulso direito")
    @RequestMapping(method = RequestMethod.GET, value="/wrist/left", produces="application/json")
    public int wristRotationLeft() {
        return leftArm.getWristRotation();
    }

    @ApiOperation(value = "Atualiza a rotação atual do pulso direito")
    @RequestMapping(method = RequestMethod.PUT, value="/wrist/left/{value}", produces="application/json")
    public int wristRotationLeft(@PathVariable("value") int value) {
        return leftArm.updateWristRotation(value);
    }

    @ApiOperation(value = "Informa a contração atual do cotovelo esquerdo")
    @RequestMapping(method = RequestMethod.GET, value="/elbow/right", produces="application/json")
    public ElbowContraction elbowContractionRight() {
        return rightArm.getElbowContraction();
    }

    @ApiOperation(value = "Atualiza a contração atual do cotovelo esquerdo")
    @RequestMapping(method = RequestMethod.PUT, value="/elbow/right/{value}", produces="application/json")
    public ElbowContraction elbowContractionRight(@PathVariable("value") ElbowContraction value) {
        return rightArm.updateElbowContraction(value);
    }

    @ApiOperation(value = "Informa a rotação atual do pulso esquerdo")
    @RequestMapping(method = RequestMethod.GET, value="/wrist/right", produces="application/json")
    public int wristRotationRight() {
        return rightArm.getWristRotation();
    }

    @ApiOperation(value = "Atualiza a rotação atual do pulso esquerdo")
    @RequestMapping(method = RequestMethod.PUT, value="/wrist/right/{value}", produces="application/json")
    public int wristRotationRight(@PathVariable("value") int value) {
        return rightArm.updateWristRotation(value);
    }
}
