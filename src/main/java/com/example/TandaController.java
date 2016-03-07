package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by shaungould on 3/7/16.
 */
@RestController
public class TandaController {

    @Autowired
    private TandaRepository tandaRepository;

    @RequestMapping(value="/Tanda/{id}")
    public ResponseEntity<Tanda> getTanda(@PathVariable("id") Long id){
        Tanda tanda = tandaRepository.findOne(id);
        return new ResponseEntity<Tanda>(tanda, HttpStatus.OK);
    }

    @RequestMapping(value="/Tanda/new",method= RequestMethod.POST)
    public ResponseEntity<?> postTanda(@RequestBody Tanda tanda){
        tanda = tandaRepository.save(tanda);
        return new ResponseEntity<Object>(tanda, HttpStatus.OK);
    }

    @RequestMapping(value="/Tanda",method=RequestMethod.POST)
    public ResponseEntity<Tanda> getTandaPost(@RequestBody TandaRequest tandaRequest){
        Tanda tanda = tandaRepository.findOne(tandaRequest.getId());
        return new ResponseEntity<Tanda>(tanda, HttpStatus.OK);
    }


    public class TandaRequest{
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }
}
