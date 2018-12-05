package web;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import web.Journeys;
import web.Users;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T23:14:44")
@StaticMetamodel(Drivers.class)
public class Drivers_ { 

    public static volatile CollectionAttribute<Drivers, Journeys> journeysCollection;
    public static volatile SingularAttribute<Drivers, String> name;
    public static volatile SingularAttribute<Drivers, Users> usersId;
    public static volatile SingularAttribute<Drivers, String> registration;
    public static volatile SingularAttribute<Drivers, Integer> id;

}