package app.api;

import app.model.Person;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Api(value = "person", description = "System", tags = {"Person"})
public interface PersonApi {

    @ApiOperation(value = "Get person by ID", response = Person.class, tags = { "Person" })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "data returned", response = Person.class),
            @ApiResponse(code = 400, message = "bad request", response = Error.class),
            @ApiResponse(code = 500, message = "internal server error") })
    @RequestMapping(value = "/person/{personId}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<Person> getPerson(@RequestHeader(value = "sessionId") String sessionId,
                                     @ApiParam(value = "ID of person to return", required = true) @PathVariable("personId") Long claimantId);
}
