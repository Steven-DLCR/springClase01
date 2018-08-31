package com.seven.services.service;

import com.seven.services.data.TipoArticulo;

import java.util.HashMap;
import java.util.List;

public interface TipoArticuloService {

    List<TipoArticulo> list();
    TipoArticulo find(Integer id);
    HashMap<String, Object> insert(TipoArticulo tipoArticulo);
    HashMap<String, Object> edit(TipoArticulo tipoArticulo);

}
