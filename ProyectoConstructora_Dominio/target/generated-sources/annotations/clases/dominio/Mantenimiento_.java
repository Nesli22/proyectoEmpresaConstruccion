package clases.dominio;

import clases.dominio.Activo;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-17T13:00:50", comments="EclipseLink-2.7.10.v20211216-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-31T00:21:19", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> parent of f42b81d (Funcionalidad Programar Mantenimiento)
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-31T00:21:19", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> parent of f42b81d (Funcionalidad Programar Mantenimiento)
@StaticMetamodel(Mantenimiento.class)
public class Mantenimiento_ { 

    public static volatile SingularAttribute<Mantenimiento, Date> fecha;
    public static volatile SingularAttribute<Mantenimiento, String> tipo;
    public static volatile SingularAttribute<Mantenimiento, Long> id;
    public static volatile SingularAttribute<Mantenimiento, Activo> activo;

}