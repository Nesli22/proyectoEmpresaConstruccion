package clases.dominio;

import clases.dominio.Activo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
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
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile ListAttribute<Persona, Activo> activos;
    public static volatile SingularAttribute<Persona, Long> id;
    public static volatile SingularAttribute<Persona, String> cargo;
    public static volatile SingularAttribute<Persona, String> nombre;

}