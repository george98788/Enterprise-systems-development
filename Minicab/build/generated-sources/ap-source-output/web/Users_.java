package web;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import web.Customers;
import web.Drivers;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T23:14:44")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, Drivers> driversCollection;
    public static volatile SingularAttribute<Users, String> roles;
    public static volatile CollectionAttribute<Users, Customers> customersCollection;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, String> username;

}