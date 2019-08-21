package com.demo.spring.rest;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.EmpRepository;
import com.demo.spring.entity.Emp;

@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmpRestController {
	
	@Autowired
	EmpRepository repo;
	
	/*@GetMapping(path="/find/{id}",
			produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity findEmp(@PathVariable("id")int id) {
		Optional<Emp> o=repo.findById(id);
		if(o.isPresent()) {
			return ResponseEntity.ok(o.get());
		}else {
			return ResponseEntity.status(404).build();
		}
	}*/
	@GetMapping(path="/find/{id}")
    public  Optional<Emp> findEmp(@PathVariable("id")int id) {
        Optional<Emp> o=repo.findById(id);
        
        return o;
    }
	@PostMapping(path="/save")
	public ResponseEntity<MyRessponse> saveEmp(@RequestBody Emp e){
		MyRessponse rep=new MyRessponse();
		if(repo.existsById(e.getId()))
		{
			rep.setMessage("Employee already exists with id "+e.getId());
		}
		else {
		rep.setMessage("Employee saved with id "+e.getId());
		repo.save(e);
		
		}
		return ResponseEntity.ok(rep);
	}
	
	@GetMapping(path="/list",produces="application/json")
	public ResponseEntity<List<Emp>> getEmpList(){
		return ResponseEntity.ok(repo.findAll());
	}

}