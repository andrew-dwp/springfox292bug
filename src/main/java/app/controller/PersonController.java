package app.controller;

import app.api.PersonApi;
import app.model.Person;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController implements PersonApi {

    public ResponseEntity<Person> getPerson(@RequestHeader(value = "interactionId") String interactionId,
                                            @ApiParam(value = "ID of person to return", required = true) @PathVariable("personId") Long personId) {
        Person person = new Person();

        return new ResponseEntity<>(person, new HttpHeaders(), HttpStatus.OK);
    }
}
