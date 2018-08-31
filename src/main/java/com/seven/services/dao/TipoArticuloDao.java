package com.seven.services.dao;

import com.seven.services.data.TipoArticulo;

import java.util.HashMap;
import java.util.List;

public interface TipoArticuloDao {

    List<TipoArticulo> list();
    TipoArticulo find(Integer id);
    HashMap<String, Object> insert(TipoArticulo tipoArticulo);
    HashMap<String, Object> edit(TipoArticulo tipoArticulo);

}
