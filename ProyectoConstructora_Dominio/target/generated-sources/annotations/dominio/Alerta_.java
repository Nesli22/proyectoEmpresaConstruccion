package dominio;

import dominio.Activo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-11-26T14:37:31", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Alerta.class)
public class Alerta_ { 

    public static volatile SingularAttribute<Alerta, String> estado;
    public static volatile SingularAttribute<Alerta, Long> id;
    public static volatile SingularAttribute<Alerta, Activo> activo;

}