import kotlinx.coroutines.runBlocking
import org.example.countXO
import org.example.divide
import org.example.tellCatFact
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

// classe de testes para a função countXO
class CountXOTest {
    @Test
    @DisplayName("it should test quantity of 'x' and 'o'")
    fun testEqualXandO() {
        // usa Assertions para validar o resultado
        Assertions.assertTrue(countXO("xxoo"))
    }

    @Test
    @DisplayName("it should test 'x' more than 'o' characters")
    fun testXMoreThanO() {
        Assertions.assertFalse(countXO("xxxxoo"))
    }

    /*
      outras anotações úteis no JUnit 5:
      - @Disabled     → desativa temporariamente um teste
      - @BeforeEach   → roda antes de cada teste (setup)
      - @AfterEach    → roda depois de cada teste (teardown)
      - @BeforeAll    → roda uma vez antes de todos os testes
      - @AfterAll     → roda uma vez depois de todos os testes
    */

    // Assumptions → é uma condicional que só fará o teste se condição for verdadeira

    @Test
    @DisplayName("it should test if assumption is true")
    fun testOMoreThanX() {
        //só executará as próximas linhas do teste se condição assumption for true
        Assumptions.assumeTrue(countXO("xxOoXo"))

        Assertions.assertFalse(countXO("xxOOooox"))
    }
}

//testar com uma função de coroutine, usaremos runBlocking.
class TellCatFactTest {
    @Test
    @DisplayName("it should not return an empty fact")
    fun testTellCatFact() {
        runBlocking {
            val fact = tellCatFact()
            Assertions.assertTrue(fact.isNotEmpty())
        }
    }
}

class DivideTest() {
    @Test
    @DisplayName("it should throw if divided by 0")
    fun cannotDivideByZero() {
        //passaremos a tipagem do erro pelo generic type de assertThrows
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            divide(20, 0)
        }
    }

    //podemos também passar uma string como nome da função
    @Test
    fun `it should divide by 0`() {
        val result = divide(10, 2)
        Assertions.assertEquals(result, 5)
    }
}

class