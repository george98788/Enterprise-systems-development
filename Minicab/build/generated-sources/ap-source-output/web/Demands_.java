package web;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import web.Customers;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T23:14:44")
@StaticMetamodel(Demands.class)
public class Demands_ { 

    public static volatile SingularAttribute<Demands, String> address;
    public static volatile SingularAttribute<Demands, String> demandsTime;
    public static volatile SingularAttribute<Demands, String> destination;
    public static volatile SingularAttribute<Demands, Customers> customerId;
    public static volatile SingularAttribute<Demands, Integer> id;
    public static volatile SingularAttribute<Demands, String> demandsDate;
    public static volatile SingularAttribute<Demands, String> customerName;
    public static volatile SingularAttribute<Demands, String> status;

}