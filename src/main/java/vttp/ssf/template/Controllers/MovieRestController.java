package vttp.ssf.template.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import vttp.ssf.template.Models.MovieDetailModel;
import vttp.ssf.template.Models.RestModel;
import vttp.ssf.template.Service.MovieDetail;
import vttp.ssf.template.Service.RestService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
public class MovieRestController {


    @Autowired
	private RestService RESvc;

    

	@GetMapping(path="{movieid}")
	public ResponseEntity<String> getNews(@PathVariable(name="movieid") String movieid) {

       String opt = RESvc.getMovieDeets(movieid);
	 	
		return ResponseEntity.ok(opt);
	}
    }
    
    






    






