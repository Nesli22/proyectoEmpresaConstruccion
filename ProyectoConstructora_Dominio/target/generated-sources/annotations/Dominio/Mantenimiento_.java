package Dominio;

import Dominio.Activo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-19T18:59:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mantenimiento.class)
public class Mantenimiento_ { 

    public static volatile SingularAttribute<Mantenimiento, Date> fecha;
    public static volatile SingularAttribute<Mantenimiento, String> tipo;
    public static volatile SingularAttribute<Mantenimiento, Long> id;
    public static volatile SingularAttribute<Mantenimiento, Activo> activo;

}