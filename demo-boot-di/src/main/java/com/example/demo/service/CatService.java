package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("CatService")
public class CatService implements IAnimalService {

	@Override
	public String operation() {
		return "realizando operacion en db - cat";
	}

}
