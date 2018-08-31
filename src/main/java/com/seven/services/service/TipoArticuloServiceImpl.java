package com.seven.services.service;

import com.seven.services.dao.TipoArticuloDao;
import com.seven.services.data.TipoArticulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TipoArticuloServiceImpl implements TipoArticuloService {

    @Autowired
    TipoArticuloDao tipoArticuloDao;

    @Override
    public List<TipoArticulo> list() {
        return tipoArticuloDao.list();
    }

    @Override
    public TipoArticulo find(Integer id) {
        return null;
    }

    @Override
    public HashMap<String, Object> insert(TipoArticulo tipoArticulo) {
        return null;
    }

    @Override
    public HashMap<String, Object> edit(TipoArticulo tipoArticulo) {
        return null;
    }
}
