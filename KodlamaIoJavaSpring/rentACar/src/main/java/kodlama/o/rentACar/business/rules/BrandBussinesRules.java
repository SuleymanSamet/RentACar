package kodlama.o.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.o.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.o.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

//bir marka eklendiğinde vera tabanında bu marka olmayacak
@AllArgsConstructor
@Service
public class BrandBussinesRules {
	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {//marka ismi tekrar ediyomu
		if(this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists");
			//core.utilities paketine yeni paket olustururuz adı exceptions oraya yazarız
		}
		
	}
	

}
