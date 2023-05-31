package Quiz08;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	
	public static void main(String[] args) {
		DataAccessObject dao1 = new OracleDao();		
		dbWork(new OracleDao());
		
		
		DataAccessObject dao2 = new OracleDao();		
		dbWork(new MySqlDao());
	}

}
