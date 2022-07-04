package upc.edu.pe.requestservice.services;

import java.util.List;

public interface CrudService<T,ID> {

    List<T> findAll() throws Exception;
    T findById(ID id) throws Exception;
}
