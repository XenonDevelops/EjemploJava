package ejecution;
import bean.UsuarioBean;
import dao.UsuarioDAO;


public class Main {
	UsuarioBean[] array=new UsuarioBean[3];
	UsuarioBean bean=new UsuarioBean();
	bean.setNombre("angel");
	bean.setaPaterno("López");
	bean.setaMaterno("Perez");
	array[0] = bean;
	//se sigue llenando el array con el resto de otros objetos

	UsuarioDAO dao=new UsuarioDAO();
	for (int i;i<array.lenght() ;i++ ) {
		dao.altaSocio(array[i]);
	}
	 
}
