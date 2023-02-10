package connection_exam;

import java.sql.Connection;//DB에 연결하기 위한
import java.sql.DriverManager;//실제적인 드라이버를 사용해서 연결할 때 사용하는 프로그램
import java.sql.ResultSet;//DB에서 데이터를 받아오면 (select)데이터를 받아 두기 위해 사용되는 프로그램
import java.sql.SQLException;//DB실행시 예외가 발생되면 예외처리를 해주기 위한 프로그램
import java.sql.Statement;//작성된 sql문장을 실행하기 위한  프로그램

public class db_connection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try{
			//1. 드라이버를 확인 -class통틀어 한번만
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver를 찾았습니다.");
		}catch(ClassNotFoundException e){
			System.out.println("Oracle Driver를 찾지 못했습니다.");
			e.printStackTrace();
		}//end.  driver확인
		try{
			//2. 연결 //한번
			String url = "jdbc:oracle:thin:@192.168.219.103:1521:xe";
			String uid = "system",pw = "prince21!";
			con = DriverManager.getConnection(url,uid,pw);
			System.out.println("DB접속완료!");
			Statement stmt = null;

			//3. 실행할 sql문장을 작성한다.
			String sql = "select * from player order by PLAYER_ID desc";
			//   System.out.println(sql);

			//4. sql을 실행할 수 있는 연결 상태를 만든다.
			stmt = con.createStatement();

			//5. 실행
			// select - executeQuery();
			ResultSet rs = stmt.executeQuery(sql);
			//   stmt.executeUpdate(String sql)
			//6. 화면출력
			while(rs.next()){
				System.out.println("["+rs.getString("PLAYER_ID")
				                      +"]["+rs.getString("PLAYER_NAME")
				                      +"]["+rs.getString("TEAM_ID")
				                      +"]["+rs.getString("E_PLAYER_NAME")
				                      +"]["+rs.getString("NICKNAME")
				                      +"]["+rs.getString("JOIN_YYYY")
				                      +"]["+rs.getString("POSITION")
				                      +"]["+rs.getInt("BACK_NO")
				                      +"]["+rs.getString("NATION")
				                      +"]["+rs.getDate("BIRTH_DATE")
				                      +"]["+rs.getString("SOLAR")
				                      +"]["+rs.getInt("HEIGHT")
				                      +"]["+rs.getInt("WEIGHT")
				                      +"]");
			}//end 게시판 리스트 보기(while)

		}catch(Exception e){
			System.out.println("게시판 작업에 오류가 발생되었습니다.");
			e.printStackTrace();
		}finally{
			try{
				//7. DB연결을 닫는다.
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}