package testModel;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Paciente;

class PacienteTest {
	Paciente p1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		p1 = new Paciente("João", 1);
		
	}

	@Test
	void testBasic() {
		assertEquals("João", p1.getNome());
		assertEquals(1, p1.getMatricula());
		
	}

}
