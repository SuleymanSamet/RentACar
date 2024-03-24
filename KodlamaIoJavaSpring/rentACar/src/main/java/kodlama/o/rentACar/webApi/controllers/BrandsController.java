package kodlama.o.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import kodlama.o.rentACar.business.abstracts.BrandService;
import kodlama.o.rentACar.business.requests.CreateBrandRequest;
import kodlama.o.rentACar.business.requests.UpdateBrandRequest;
import kodlama.o.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.o.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;

	@GetMapping()
	public List<GetAllBrandsResponse>getAll(){
		return brandService.getAll();
	}
	@GetMapping("/{id}")//burda kullanılan id @pathvariable dan al *
	public GetByIdBrandResponse getById(@PathVariable int id) {
		return brandService.getById(id); 
	}
	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)//postlar201 döndürsün diye yaptık
	public void add(@Valid CreateBrandRequest brandRequest) {
		this.brandService.add(brandRequest);
	}
	@PutMapping //GÜNCELLEME * 
	public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	@DeleteMapping("/{id}")//silme işlemi *
	public void delete(@PathVariable int id) {
		this.brandService.delete(id);
	}

}