package kodlama.o.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.o.rentACar.business.abstracts.ModelService;
import kodlama.o.rentACar.business.requests.CreateModelRequest;
import kodlama.o.rentACar.business.responses.GetAllModelsResponse;
import kodlama.o.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.o.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.o.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService{
	
	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllModelsResponse> getAll() {
		List<Model> models=modelRepository.findAll();
		
		List<GetAllModelsResponse> modelsResponse=models.stream()
				.map(model->this.modelMapperService.forResponse()
						.map(model, GetAllModelsResponse.class)).collect(Collectors.toList());
		
		
		return modelsResponse;
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model=this.modelMapperService.forRequest().map(createModelRequest, Model.class);
		
		this.modelRepository.save(model);
		
	}

}
