package com.seven.services.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.seven.services.TipoArticuloController;
import com.seven.services.data.TipoArticulo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class TipoArticuloDaoImpl implements TipoArticuloDao {

    private static Logger logger = LoggerFactory.getLogger(TipoArticuloController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private JedisPool pool;


    @Override
    public List<TipoArticulo> list() {

        List<TipoArticulo> list = new ArrayList<>();

        Jedis jedis = pool.getResource();
        String jsonListTipoArticulo = jedis.get("listTipoArticulo20");
        Type listType = new TypeToken<List<TipoArticulo>>(){}.getType();
        list = new Gson().fromJson(jsonListTipoArticulo, listType);

        logger.info("redis: " + list);

        if (list == null) {

            logger.info("redis: NO HAY DATOS EN CACHE");

            String sql = "SELECT * FROM tipo_articulo";
            list = jdbcTemplate.query(sql, new RowMapper<TipoArticulo>() {

                public TipoArticulo mapRow(ResultSet rs, int rowNum) throws SQLException {
                    TipoArticulo tipoArticulo = new TipoArticulo();

                    tipoArticulo.setId(rs.getInt("id"));
                    tipoArticulo.setNombre(rs.getString("nombre"));
                    tipoArticulo.setEstado(rs.getInt("estado"));

                    return tipoArticulo;
                }

            });

            String json = new Gson().toJson(list);
            jedis.set("listTipoArticulo20", json);
        }

        return list;
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
