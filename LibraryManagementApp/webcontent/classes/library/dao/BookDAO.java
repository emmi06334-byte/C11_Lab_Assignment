package webcontent.classes.library.dao;

import java.sql.*;
import java.util.*;
import webcontent.classes.library.model.Book;

public class BookDAO {
    public void issueBook(Book b) throws Exception {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO books(title,author,reference_id,issued_to,issue_date,submission_date) VALUES(?,?,?,?,?,?)"
        );
        ps.setString(1, b.getTitle());
        ps.setString(2, b.getAuthor());
        ps.setString(3, b.getReferenceId());
        ps.setInt(4, b.getIssuedTo());
        ps.setDate(5, b.getIssueDate());
        ps.setDate(6, b.getSubmissionDate());
        ps.executeUpdate();
        con.close();
    }

    public List<Book> getAllBooks() throws Exception {
        List<Book> list = new ArrayList<>();
        Connection con = DBUtil.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM books");
        while(rs.next()){
            Book b = new Book();
            b.setId(rs.getInt("id"));
            b.setTitle(rs.getString("title"));
            b.setAuthor(rs.getString("author"));
            b.setReferenceId(rs.getString("reference_id"));
            b.setIssuedTo(rs.getInt("issued_to"));
            b.setIssueDate(rs.getDate("issue_date"));
            b.setSubmissionDate(rs.getDate("submission_date"));
            list.add(b);
        }
        con.close();
        return list;
    }
}
