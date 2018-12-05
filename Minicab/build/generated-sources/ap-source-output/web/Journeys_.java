package web;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import web.Drivers;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-04T23:14:44")
@StaticMetamodel(Journeys.class)
public class Journeys_ { 

    public static volatile SingularAttribute<Journeys, Date> journeyTime;
    public static volatile SingularAttribute<Journeys, Integer> distance;
    public static volatile SingularAttribute<Journeys, Drivers> driversId;
    public static volatile SingularAttribute<Journeys, String> destination;
    public static volatile SingularAttribute<Journeys, Date> journeyDate;
    public static volatile SingularAttribute<Journeys, Integer> id;

}