package clases.dominio;

import clases.dominio.Activo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-31T00:21:19", comments="EclipseLink-2.7.10.v20211216-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-18T20:16:02", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> Stashed changes
@StaticMetamodel(Mantenimiento.class)
public class Mantenimiento_ { 

    public static volatile SingularAttribute<Mantenimiento, Date> fecha;
    public static volatile SingularAttribute<Mantenimiento, String> tipo;
    public static volatile SingularAttribute<Mantenimiento, Long> id;
    public static volatile SingularAttribute<Mantenimiento, Activo> activo;

}