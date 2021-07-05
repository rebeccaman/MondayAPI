package com.MondayAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MondayController {



    @RequestMapping("/shop/{id}")

    public ResponseEntity<Products> getProductByID(@PathVariable("id") int id) {
        if (id == 1) {
            return new ResponseEntity<Products>(new Products(1, "Sugar",100), HttpStatus.OK);
        } else if (id == 2) {
            return new ResponseEntity<Products>(new Products(2, "Vanilla", 2000), HttpStatus.OK);
        } else if (id == 3) {
            return new ResponseEntity<Products>(new Products(3, "Baking Powder",500), HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
