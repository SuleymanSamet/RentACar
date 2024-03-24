package kodlama.o.rentACar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
	@NotNull //valıdation olayı : veri girilmesini istiyoruz model ekliyceksen ismini gir
	@NotBlank//boşluk la geçmesin
	@Size(min=3,max=20)//en az 3 karakter en fazla 20
	private String name;
	@NotNull
	@NotBlank
	private int brandId;

}
