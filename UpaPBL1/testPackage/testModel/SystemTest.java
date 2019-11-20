package testModel;

import model.Exame;
import model.Medico;
import model.Paciente;
import util.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SystemTest {

	private Medico m1, m2;
	private Paciente p1, p2, p3, p4, p5, p6;
	private Exame exameCoracao, exameCoracao2;
	private MyLinkedList listaMedico = new MyLinkedList();
	private MyLinkedList listaPaciente = new MyLinkedList();
	private MyLinkedList listaExame = new MyLinkedList();
	private MyLinkedList listaGeralExame = new MyLinkedList();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		m1 = new Medico("João", 123);
		m2 = new Medico("José", 456);

		p1 = new Paciente("Mateus", 123);
		p2 = new Paciente("Lucas", 456);
		p3 = new Paciente("Prioritario 0", 000);
		p4 = new Paciente("Prioritario 1", 111);
		p5 = new Paciente("Prioritario 2", 222);
		p6 = new Paciente("Prioritario 3", 333);

		exameCoracao = new Exame("Coração", p1, m1);
		exameCoracao2 = new Exame("Coração", p2, m1);

	}

	@Test
	void testAddMedico() {

		listaMedico.add(m1);
		listaMedico.add(m2);

		assertEquals(123, m1.getCrm());

		m1.setNome("Maria");
		assertEquals("Maria", m1.getNome());
		assertEquals(123, m1.getCrm());

	}

	@Test
	void testEditaMedico() {

		assertFalse(m1.getCrm() == 456);
		assertFalse(m1.getNome().equals("Pedro"));
		m1.setNome("Pedro");
		assertTrue(m1.getNome().equals("Pedro"));

	}

	@Test
	void testAddPaciente() {
		assertTrue(listaPaciente.isEmpty());
		listaPaciente.add(p1);
		listaPaciente.add(p2);

		listaPaciente.add(0, p3);
		assertEquals(p3, listaPaciente.getNode(0));

		listaPaciente.add(1, p6);
		assertEquals(p6, listaPaciente.getNode(1));

		listaPaciente.add(1, p4);
		assertEquals(p4, listaPaciente.getNode(1));

		listaPaciente.add(2, p5);
		assertEquals(p5, listaPaciente.getNode(2));

	}

	@Test
	void testListaPacientePorMedico() {

		assertFalse(m1.getCrm() == 111);

		/*
		 * Ainda não sei que classe ficará a lista de pacientes, farei depois de
		 * terminar os testes e os adicionarei aqui.
		 */

	}

	@Test
	void testRealizaAtendimento() {

		listaPaciente.add(p1);
		assertEquals(p1, listaPaciente.remove(0));
		/*
		 * Não sei como testar a relação medico e paciente para os outros requisitos
		 * para verificar se o objeto removido corresponde ao CRM do médico que realizou
		 * o atendimento
		 */

		assertNull(listaPaciente.remove(0));

	}

	@Test
	void testSolicitaExame() {

		assertTrue(listaExame.isEmpty());

		listaExame.add(exameCoracao);
		Exame temp = new Exame("Coração", p1, m1);
		assertEquals(temp, listaExame.get(0));

		listaGeralExame.add(exameCoracao);

	}

	@Test
	void testListaExames() {

		listaGeralExame.add(exameCoracao);
		listaGeralExame.add(exameCoracao2);
		// listaExame.add(exameCoracao);
		// listaExame.add(exameCoracao2);

		assertEquals(2, listaGeralExame.size());

		assertEquals(exameCoracao, listaGeralExame.getNode(0));

		listaGeralExame.remove(0);
		assertEquals(exameCoracao2, listaGeralExame.getNode(0));

	}

	@Test
	void testListaAtendimentoMedico() {
		Exame temp = (Exame) listaGeralExame.get(0);

		assertFalse(temp.getMedico().getCrm() == 123);
		listaGeralExame.add(exameCoracao);
		assertEquals(123, temp.getMedico().getCrm());

	}

	@Test
	void testListaExamesSolicitados() {
		listaGeralExame.add(exameCoracao);
		Paciente pacTemp = new Paciente("Ana", 999);
		Exame temp = (Exame) listaGeralExame.get(0);

		assertFalse(temp.getPaciente().equals(pacTemp));
		
		

	}

}
