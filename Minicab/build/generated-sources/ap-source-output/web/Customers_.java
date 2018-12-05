package web;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import web.Demands;
import web.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T23:14:44")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> address;
    public static volatile CollectionAttribute<Customers, Demands> demandsCollection;
    public static volatile SingularAttribute<Customers, String> name;
    public static volatile SingularAttribute<Customers, Integer> id;
    public static volatile SingularAttribute<Customers, Users> userId;
    public static volatile SingularAttribute<Customers, String> email;

}