package clases.dominio;

import clases.dominio.Mantenimiento;
import clases.dominio.Persona;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-17T13:00:50", comments="EclipseLink-2.7.10.v20211216-rNA")
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-31T00:21:19", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> parent of f42b81d (Funcionalidad Programar Mantenimiento)
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-31T00:21:19", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> parent of f42b81d (Funcionalidad Programar Mantenimiento)
=======
@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-31T00:21:19", comments="EclipseLink-2.7.10.v20211216-rNA")
>>>>>>> parent of f42b81d (Funcionalidad Programar Mantenimiento)
@StaticMetamodel(Activo.class)
public class Activo_ { 

    public static volatile SingularAttribute<Activo, Date> fechaAdquisicion;
    public static volatile SingularAttribute<Activo, String> tipo;
    public static volatile SingularAttribute<Activo, String> estado;
    public static volatile SingularAttribute<Activo, String> ubicacion;
    public static volatile SingularAttribute<Activo, Persona> responsable;
    public static volatile ListAttribute<Activo, Mantenimiento> mantenimientos;
    public static volatile SingularAttribute<Activo, String> costo;
    public static volatile SingularAttribute<Activo, Long> id;
    public static volatile SingularAttribute<Activo, String> nombre;
    public static volatile SingularAttribute<Activo, String> numSerie;

}