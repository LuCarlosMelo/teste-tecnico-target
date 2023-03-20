package application;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import json.entities.DTO;
import json.services.ReaderJson;

public class Questao3 {

	public static void main(String[] args) throws IOException {

		String filePath = "./arquivo/dados.json";

		String jsonText = ReaderJson.readJson(filePath);

		Type type = new TypeToken<List<DTO>>() {
		}.getType();

		List<DTO> dto = new Gson().fromJson(jsonText, type);

		Optional<BigDecimal> max = dto.stream().map(x -> x.getValor()).max(Comparator.naturalOrder());
		Optional<BigDecimal> min = dto.stream().map(x -> x.getValor()).min(Comparator.naturalOrder());
		
	
		 double media = dto.stream()
                 .map(DTO::getValor)
                 .mapToDouble(BigDecimal::doubleValue)
                 .average()
                 .orElse(Double.NaN);
		
	    System.out.println();
	    
	    dto.stream()
        .filter(x -> x.getValor().compareTo(BigDecimal.valueOf(media)) > 0 )
        .forEach(x -> System.out.println("Dia: " + x.getDia()));
	    
	    System.out.println(BigDecimal.valueOf(media));
	    
		System.out.println(max.get());
		System.out.println(min.get());

	}
}
