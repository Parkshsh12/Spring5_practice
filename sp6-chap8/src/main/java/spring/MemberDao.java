package spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDao {
	private JdbcTemplate jdbcTemplate;
	
	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	// email을 통해서 모든 정보를 가져옴
	public Member selectByEmail(String email) {
		List<Member> results = jdbcTemplate.query("select * from MEMBER where EMAIL = ?", 
				new RowMapper<Member>() {
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(
									rs.getString("EMAIL"),
									rs.getString("PASSWORD"),
									rs.getString("NAME"),
									rs.getTimestamp("REGDATE").toLocalDateTime());
						member.setId(rs.getLong("ID"));
						return member;
								
					}
		},
				email);
			
		return results.isEmpty() ? null : results.get(0);
	}
	
	// 데이터 넣기
	public void insert(Member member) {
	}
	
	// 데이터 업데이트
	public void update(Member member) {
	}
	
	// 모든 데이터를 가져옴
	public Collection<Member> selectAll() {
		return null;
	}
}
