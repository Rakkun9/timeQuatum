package Algorithm;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataControler {
    @PostMapping("api/dataProcesada")
    public ResponseEntity<String> dataProcesada(@RequestBody ControllerData datos) {
        //list of the data

        String data1 = datos.getData1();
        String dato2 = datos.getData2();

        String respuesta = "resultados esperados";

        return ResponseEntity.ok(respuesta);
    }
}
