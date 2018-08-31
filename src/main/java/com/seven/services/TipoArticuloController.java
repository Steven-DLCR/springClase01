package com.seven.services;

import com.seven.services.data.TipoArticulo;
import com.seven.services.service.TipoArticuloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/tipoarticulo")
public class TipoArticuloController {

    private static Logger logger = LoggerFactory.getLogger(TipoArticuloController.class);

    @Autowired
    TipoArticuloService tipoArticuloService;

    @RequestMapping(method = RequestMethod.GET)
    public List<TipoArticulo> list() {

        logger.info("entrando al API GET");

        List<TipoArticulo> list = new ArrayList<>();
        list = tipoArticuloService.list();

        return list;

    }

}
