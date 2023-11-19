package Algorithm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataControler {
    @PostMapping("/processData")
    public ResponseData processData(@RequestBody ControllerData datos) {
        //list of the data

        String data1 = datos.getData1();
        String dato2 = datos.getData2();

        ResponseData respuesta = new ResponseData("Hola mundo");
        System.out.println(respuesta);

        return respuesta;
    }
}
