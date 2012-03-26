package controllers;

import models.Foo;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.foo;

import java.util.ArrayList;
import java.util.List;

import play.libs.Json;

public class MyController extends Controller {
    
    public static Result foo() {
        return ok(foo.render());
    }
    
    public static Result getFoos() {
        return ok(Json.toJson(Foo.find.all()));
    }

    public static Result addFoo() {
        Form<Foo> form = form(Foo.class).bindFromRequest();
        Foo foo = form.get();
        foo.save();
        return redirect(routes.MyController.foo());
    }
    
}
