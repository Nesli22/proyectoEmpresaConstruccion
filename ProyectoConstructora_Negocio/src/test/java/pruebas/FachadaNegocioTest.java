package pruebas;

import negocio.FachadaNegocio;
import clases.dominio.Activo;
import clases.dominio.Persona;
import interfaces.INegocio;
import java.time.Instant;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Date;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para verificar las funcionalidades de la clase
 * FachadaNegocio.
 *
 * Esta clase contiene métodos de prueba para registrar, recuperar, consultar y
 * editar activos y personas en el sistema. Se utiliza JUnit para llevar a cabo
 * las pruebas.
 *
 * Author: Rodrigo Gtz
 */
class FachadaNegocioTest {

    /**
     * Instancia de la interfaz INegocio que se probará
     */
    private INegocio fachadaNegocio;

    /**
     * Configuración inicial antes de cada prueba. Se ejecuta antes de cada
     * método de prueba para garantizar un entorno limpio.
     */
    @BeforeEach
    void setUp() {
        fachadaNegocio = new FachadaNegocio();
    }

    /**
     * Prueba para verificar que un activo básico se registra correctamente. Se
     * crea un activo de prueba y se llama al método registrarActivo.
     */
    @Test
    @DisplayName("Registrar un activo básico correctamente")
    void RegistrarActivoTest() {
        Activo enEspera = crearActivoPrueba();
        boolean exito = fachadaNegocio.registrarActivo(enEspera);
        assertTrue(exito, "El registro del activo debería ser exitoso");
    }

    /**
     * Prueba para obtener todas las personas de la base de datos. Se verifica
     * que la lista no sea nula y contenga al menos una persona.
     */
    @Test
    @DisplayName("Obtener todas las personas de la base de datos")
    void recuperarPersonasTest() {
        List<Persona> resultado = fachadaNegocio.recuperarPersonas();
        assertNotNull(resultado, "La lista de personas no debería ser nula");
        assertFalse(resultado.isEmpty(), "La lista de personas debería contener al menos una persona");
        boolean exito = resultado.stream().anyMatch(persona -> persona instanceof Persona);
        assertTrue(exito, "Se obtienen las personas correctamente de la base de datos");
    }

    /**
     * Prueba para consultar el estado de los activos. Se verifica que el
     * resultado no sea nulo y que contenga activos.
     */
    @Test
    @DisplayName("Consultar el estado del activo")
    void consultarEstadoTest() {
        Activo activoConsulta = this.crearActivoPrueba();
        fachadaNegocio.registrarActivo(activoConsulta);
        List<Activo> resultado = this.fachadaNegocio.consultarEstado("ActivoPrueba");
        assertNotNull(resultado, "El resultado no debería ser nulo");
        assertFalse(resultado.isEmpty(), "La lista de activos no debería estar vacía");
        boolean exito = resultado.stream().anyMatch(activo -> activo instanceof Activo);
        assertTrue(exito, "Se deben obtener activos correctamente de la base de datos");
          assertEquals("Operativo", resultado.get(resultado.size() - 1).getEstado());
    }

    /**
     * Prueba para editar un activo correctamente. Se crea un activo, se
     * registra, se edita y se verifica si la edición fue exitosa.
     */
    @Test
    @DisplayName("Editar un activo correctamente")
    void editarActivo() {
        Activo activoEditar = this.crearActivoPrueba();
        fachadaNegocio.registrarActivo(activoEditar);
        activoEditar.setNombre("ActivoPrueba");
        activoEditar.setNumSerie("12345");
        boolean exito = fachadaNegocio.editarActivo(activoEditar);
        assertTrue(exito, "La edición del activo debería ser exitosa");
    }

    /**
     * Prueba para consultar todos los activos. Se verifica que el resultado no
     * sea nulo y que contenga al menos un activo.
     */
    @Test
    @DisplayName("Consultar todos los activos correctamente")
    void consultarActivosTest() {
        Activo activoConsulta = this.crearActivoPrueba();
        fachadaNegocio.registrarActivo(activoConsulta);
        List<Activo> resultado = this.fachadaNegocio.consultarActivos();
        assertNotNull(resultado, "La lista de activos no debería ser nula");
        assertFalse(resultado.isEmpty(), "La lista de activos debería contener al menos un activo");
        boolean exito = resultado.stream().anyMatch(activo -> activo instanceof Activo);
        assertTrue(exito, "Se deben obtener activos correctamente de la base de datos");
    }

    /**
     * Prueba para eliminar un activo por su ID. Se crea un activo, se registra
     * y luego se elimina.
     */
    @Test
    @DisplayName("Eliminar un activo por ID correctamente")
    void eliminarActivoPorIdTest() {
        Activo activoEliminar = this.crearActivoPrueba();
        fachadaNegocio.registrarActivo(activoEliminar);
        Long idActivo = activoEliminar.getId();
        boolean exitoEliminacion = fachadaNegocio.eliminarActivoPorId(idActivo);
        assertTrue(exitoEliminacion, "La eliminación del activo debería ser exitosa");

        // Verificar que el activo ya no esté en la lista
        List<Activo> activosRestantes = fachadaNegocio.consultarActivos();
        boolean existe = activosRestantes.stream().anyMatch(activo -> activo.getId().equals(idActivo));
        assertFalse(existe, "El activo no debería existir después de ser eliminado");
    }

    private Activo crearActivoPrueba() {
        return new Activo(1L, "ActivoPrueba", "Herramienta", "Operativo", "54321", Date.from(Instant.now()));
    }
}
