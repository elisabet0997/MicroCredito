
import org.junit.Before;
import org.junit.Test;
import com.fyg.microcredito.dto.Login;
import junit.framework.TestCase;
import com.fyg.microcredito.web.JSONServiceLogin;

public class JSONTest extends TestCase {
	private JSONServiceLogin data;
	private Login dataUsuarios;
	
	@Before
	public void setUp() throws Exception {
		data = new JSONServiceLogin();
		dataUsuarios = new Login();
		dataUsuarios.setContrasenia("123456");
	}

	@Test
	public void testConsultaUsuarios() {
		try {
			data.consultaUsuariosGeneral(dataUsuarios);
			
		}
		catch (Exception e) 
		{
			System.out.println("No se pudo hacer la consulta a usuarios 2" + e);
		}
	}
}
