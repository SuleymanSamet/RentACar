package kodlama.o.rentACar.business.abstracts;

import java.util.List;

import kodlama.o.rentACar.business.requests.CreateModelRequest;
import kodlama.o.rentACar.business.responses.GetAllModelsResponse;

public interface ModelService {
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);

}
