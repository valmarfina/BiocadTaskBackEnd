package marfina.lera.BiocadTaskBackEnd.controllers;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

import static marfina.lera.BiocadTaskBackEnd.jsonReaderTool.JsonReaderHelper.JsonHelperReturnConway;
import static marfina.lera.BiocadTaskBackEnd.jsonReaderTool.JsonReaderHelper.JsonHelperReturnFibonacci;


@Controller
public class jsonParserController {
    @GetMapping("/jsonparser")
    public String helloPage(Model model, Model model2) throws IOException, ParseException {
        model.addAttribute("ConwayList", JsonHelperReturnConway());
        model2.addAttribute("FibonacciList", JsonHelperReturnFibonacci());
        return "first/jsonparser";
    }
}
