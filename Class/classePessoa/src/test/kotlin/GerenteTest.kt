import classe.Gerente
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.*

internal class GerenteTest {

    val prod = Gerente(
        "nome",
        "Rua",
        "678 999 212"
    )

    @BeforeEach
    fun add() {
        prod.addproduct("Leite")
        prod.addproduct("Nescau")
    }

    @Test
    fun addproduct() {
        assertEquals(2, prod.ListaDeCompras.size)
        assertTrue(prod.ListaDeCompras.contains("Nescau"))
        assertTrue(prod.ListaDeCompras.contains("Leite"))
        assertIsNot<String>(prod.ListaDeCompras.contains("Leite"))
    }

    @Test
    fun removeproduct() {
        prod.removeproduct("Nescau")

        assertEquals(1, prod.ListaDeCompras.size)
        assertFalse(prod.ListaDeCompras.contains("Nescau"))
        assertTrue(prod.ListaDeCompras.contains("Leite"))
    }
}