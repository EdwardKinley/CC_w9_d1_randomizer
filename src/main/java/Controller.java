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

        get("/", (req, res) -> {
            return "Hello World!";
        });

        get("/one", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("one", nameSelector.getRandomName());
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/1", (req, res) -> {

            HashMap<String, Object> model = new HashMap<>();
            model.put("one", nameSelector.getRandomName());
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/two", (req, res) -> {

            NameSelector nameSelector1 = new NameSelector();
            HashMap<String, Object> model = new HashMap<>();
            model.put("two", nameSelector1.getRandomNames(2));
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/2", (req, res) -> {

            NameSelector nameSelector1 = new NameSelector();
            HashMap<String, Object> model = new HashMap<>();
            model.put("two", nameSelector1.getRandomNames(2));
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/:number/:groupsize", (req, res) -> {

            NameSelector nameSelector1 = new NameSelector();
            HashMap<String, Object> model = new HashMap<>();
            model.put("groups", nameSelector1.getRandomGroups(Integer.parseInt(req.params(":number")), Integer.parseInt(req.params(":groupsize"))));
            model.put("template", "groups.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);


        get("/:number", (req, res) -> {

            NameSelector nameSelector1 = new NameSelector();
            HashMap<String, Object> model = new HashMap<>();
            model.put("multiple", nameSelector1.getRandomNames(Integer.parseInt(req.params(":number"))));
            model.put("template", "multiple.vtl");
            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);


    }
}
