package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.DoUntil;
import com.greenfox.frontend.services.AppendService;
import com.greenfox.frontend.services.DoUntilService;
import com.greenfox.frontend.services.DoublingService;
import com.greenfox.frontend.services.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    private final DoublingService doublingService;
    private final GreeterService greeterService;
    private final AppendService appendService;
    private final DoUntilService doUntilService;

    @Autowired
    public WebController(DoublingService doublingService, GreeterService greeterService, AppendService appendService, DoUntilService doUntilService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendService = appendService;
        this.doUntilService = doUntilService;
    }

    @GetMapping(value = {"/doubling"})
    public ResponseEntity<?> getDoubling(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            return new ResponseEntity<>(doublingService.getDoubling(input), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doublingService.getError(), HttpStatus.OK);
        }
    }

    @GetMapping(value = {"/greeter"})
    public ResponseEntity<?> getGreeter(@RequestParam(value = "name", required = false) String name,
                                        @RequestParam(value = "title", required = false) String title) {
        if (name != null && title != null) {
            return new ResponseEntity<>(greeterService.getGreeter(name, title), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(greeterService.getError(name, title), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = {"/appenda/{appendable}"})
    public ResponseEntity<?> getAppend(@PathVariable(required = false) String appendable) {
        if (appendable != null) {
            return new ResponseEntity<>(appendService.addA(appendable), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity<?> postDoUntil(@RequestBody(required = false) DoUntil until, @PathVariable String operation) {
        if (until == null) {
            return new ResponseEntity<>(doublingService.getError(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doUntilService.getDoUntil(operation, until.getUntil()), HttpStatus.BAD_REQUEST);
        }
    }
}
