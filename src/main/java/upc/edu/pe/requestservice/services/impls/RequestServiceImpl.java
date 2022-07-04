package upc.edu.pe.requestservice.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import upc.edu.pe.requestservice.entities.Request;
import upc.edu.pe.requestservice.exception.ResourceNotFoundException;
import upc.edu.pe.requestservice.model.Worker;
import upc.edu.pe.requestservice.repositories.RequestRepository;
import upc.edu.pe.requestservice.services.RequestService;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public List<Request> findAll() throws Exception {
        return requestRepository.findAll();
    }

    @Override
    public Request findById(Long id) throws Exception {
        return requestRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Request","Id",id));
    }

    @Override
    public Request createRequest(Request request) {
        return requestRepository.save(request);
    }
}
