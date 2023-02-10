package connection_exam;

import java.sql.Connection;//DB에 연결하기 위한
import java.sql.DriverManager;//실제적인 드라이버를 사용해서 연결할 때 사용하는 프로그램
import java.sql.ResultSet;//DB에서 데이터를 받아오면 (select)데이터를 받아 두기 위해 사용되는 프로그램
import java.sql.SQLException;//DB실행시 예외가 발생되면 예외처리를 해주기 위한 프로그램
import java.sql.Statement;//작성된 sql문장을 실행하기 위한  프로그램
import java.util.Scanner;

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
			String sql = "select no,title,writer,wdate,hit from board order by no desc";
			//   System.out.println(sql);

			//4. sql을 실행할 수 있는 연결 상태를 만든다.
			stmt = con.createStatement();

			//5. 실행
			// select - executeQuery();
			// insert,update,delete- executeUpdate()
			// select인 경우 데이터를 받아서 처리해야 하므로
			// 결과를 받는 객체인 ResultSet이 필요하고 가져온 ResultSet결과를 에 담아두게 된다.
			ResultSet rs = stmt.executeQuery(sql);
			//   stmt.executeUpdate(String sql)
			//6. 화면출력
			while(rs.next()){
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String writer= rs.getString("writer");
				String wdate = rs.getString("wdate");
				int hit = rs.getInt("hit");
				System.out.println("["+no+"]["+title+"]["+writer+"]["+wdate+"]["+hit+"]");
			}//end 게시판 리스트 보기(while)

			//=============글쓰기처리=============
			//3. 실행할 sql문장을 작성한다.
			//3-1 입력할 데이터 받기
			Scanner sc = new Scanner(System.in);
			//   String title = "java";
			//   String writer = "이영환";
			//   String content = "java쉽게 배우기";
			System.out.print("글 제목 : ");
			String title = sc.next();
			System.out.print("작성자 : ");
			String writer = sc.next();
			System.out.print("글 내용 : ");
			String content = sc.next();

			sql =
					"insert into board(no, title, writer, content)"+
							"values(board_seq.nextval,'"+title+"',"+"'"+writer+"','"+content+"')";
			//   System.out.println(sql);

			//4. sql을 실행할 수 있는 연결 상태를 만든다.
			//   stmt = con.createStatement();

			//5. 실행
			// select - executeQuery();
			// insert,update,delete- executeUpdate()
			// select인 경우 데이터를 받아서 처리해야 하므로
			// 결과를 받는 객체인 ResultSet이 필요하고 가져온 ResultSet결과를 에 담아두게 된다.
			int n = stmt.executeUpdate(sql);
			//   stmt.executeUpdate(String sql)
			//6. 화면출력
			if(n>0){
				System.out.println("글이 성공적으로 등록되었습니다.");
			}

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