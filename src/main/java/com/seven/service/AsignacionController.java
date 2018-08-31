package com.seven.service;

import com.seven.service.response.AsignacionResponse;
import com.seven.service.services.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/asignacion")
public class AsignacionController {

    @Autowired
    AsignacionService asignacionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AsignacionResponse> list() {

        List<AsignacionResponse> lista = new ArrayList<>();

        AsignacionResponse asignacion1 = new AsignacionResponse(
                "22412199",
                370,
                "22222222",
                "08121201",
                "121220201200",
                "08111100",
                "201010292010",
                true,
                "S00000000001"
        );

        AsignacionResponse asignacion2 = new AsignacionResponse(
                "22412199",
                370,
                "22222222",
                "08121201",
                "121220201200",
                "08111100",
                "201010292010",
                true,
                "S00000000002"
        );

        AsignacionResponse asignacion3 = new AsignacionResponse(
                "22412199",
                370,
                "22222222",
                "08121201",
                "121220201200",
                "08111100",
                "201010292010",
                true,
                "S00000000003"
        );

        lista.add(asignacion1);
        lista.add(asignacion2);
        lista.add(asignacion3);

        return lista;
    }

    @RequestMapping(value = "/{codreq}", method = RequestMethod.GET)
    public AsignacionResponse find(@PathVariable String codreq) {

        AsignacionResponse response = new AsignacionResponse(
            "22412199",
            370,
            "22222222",
            "08121201",
            "121220201200",
            "08111100",
            "201010292010",
            true,
            "S00000000001"
        );

        return response;

    }

}
