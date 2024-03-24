package kodlama.o.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service//bunun her seferinde yeni bir model mapper olmasın
@AllArgsConstructor//model mapper enjection yapıcaz
public class ModelMapperManager implements ModelMapperService{
	private ModelMapper modelMapper;//bunu yaptıgımızda 50 tane yapmasın 1 tae olsun onu kullansın 

	@Override
	public ModelMapper forResponse() {//gevşek mapleme yap id name sadece var olanları maple
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		return this.modelMapper;
	}

	@Override
	public ModelMapper forRequest() {//herşey maplensin yoksa hata ver
		this.modelMapper.getConfiguration()
		.setAmbiguityIgnored(true)
		.setMatchingStrategy(MatchingStrategies.STANDARD);
		return this.modelMapper;
	}

}
