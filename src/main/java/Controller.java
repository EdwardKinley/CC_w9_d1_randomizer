import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class Controller {

    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        NameSelector nameSelector = new NameSelector();
        String one = nameSelector.getRandomName();

        get("/", (req, res) -> {
            return "Hello World!";
        });

        get("/one", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("one", nameSelector.getRandomName());
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);



//
//
//
//        get("/flights", (req, res) -> {
//
//            HashMap<String, Object> model = new HashMap<>();
//
//            model.put("template", "flights.vtl");
//            return new ModelAndView(model, "layout.vtl");
//
//        }, velocityTemplateEngine);
    }
}
