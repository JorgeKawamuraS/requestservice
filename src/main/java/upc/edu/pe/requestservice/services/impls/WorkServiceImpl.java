package upc.edu.pe.requestservice.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.requestservice.entities.Request;
import upc.edu.pe.requestservice.entities.Work;
import upc.edu.pe.requestservice.exception.ResourceNotFoundException;
import upc.edu.pe.requestservice.repositories.RequestRepository;
import upc.edu.pe.requestservice.repositories.WorkRepository;
import upc.edu.pe.requestservice.services.WorkService;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkRepository workRepository;

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public List<Work> findAll() throws Exception {
        return workRepository.findAll();
    }

    @Override
    public Work findById(Long aLong) throws Exception {
        return workRepository.findById(aLong)
                .orElseThrow(()->new ResourceNotFoundException("Work","Id",aLong));
    }

    @Override
    public Work createWork(Long requestId, Work work) {
        Request request = requestRepository.findById(requestId)
                .orElseThrow(()->new ResourceNotFoundException("Request","Id",requestId));
        work.setRequest(request);
        return workRepository.save(work);
    }
}
