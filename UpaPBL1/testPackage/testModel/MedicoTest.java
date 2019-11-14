package testModel;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Medico;

class MedicoTest {

	Medico m1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		m1 = new Medico("João", 1);

	}

	@Test 
	void testBasic() {
		assertEquals("João", m1.getNome());
		assertEquals(1, m1.getCrm());
	}

}
