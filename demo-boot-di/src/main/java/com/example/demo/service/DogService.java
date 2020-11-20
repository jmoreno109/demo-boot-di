package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class DogService implements IAnimalService {

	@Override
	public String operation() {
		return "realizando operacion en db - dog";
	}

}
