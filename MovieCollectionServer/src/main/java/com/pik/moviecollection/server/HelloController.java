package com.pik.moviecollection.server;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/service/greeting")
@ResponseStatus(HttpStatus.OK)
public class HelloController {

    int x = 1;
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getGreeting(@PathVariable String name) {
	return "Hello11 " + name;
    }
}
