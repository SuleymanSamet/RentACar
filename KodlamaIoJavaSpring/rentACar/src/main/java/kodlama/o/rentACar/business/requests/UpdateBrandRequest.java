package kodlama.o.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
	private int id;//update yaparken id lazım create kısmında değildi çünkü veritabanı otomatık artandı 
	private String name;

}
