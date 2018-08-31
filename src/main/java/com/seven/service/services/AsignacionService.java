package com.seven.service.services;

import com.seven.service.data.Asignacion;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AsignacionService {

    public List<Asignacion> list();
    public Asignacion find(int id);
    public Asignacion insert(Asignacion asignacion);
    public Asignacion edit(Asignacion asignacion);

}
