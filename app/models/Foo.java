package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foo extends Model {
    
    @Id
    public String id;
    
    public String name;

    public static Model.Finder<String, Foo> find = new Model.Finder(String.class, Foo.class);
    
}
