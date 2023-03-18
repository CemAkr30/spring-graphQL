package cakar.cs.springgraphql.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(){
        return "Hello GraphQL";
    }
}
