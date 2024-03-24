package kodlama.o.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
	ModelMapper forResponse();//responce nesneleri için 
	ModelMapper forRequest();//request nesneleri için

}
