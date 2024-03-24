package kodlama.o.rentACar.business.abstracts;

import java.util.List;

import kodlama.o.rentACar.business.requests.CreateBrandRequest;
import kodlama.o.rentACar.business.requests.UpdateBrandRequest;
import kodlama.o.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.o.rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);//CreateBrandRequest içinde olan bir name ver dedik
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
}
