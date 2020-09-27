package package04_Search;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.naming.*;
import javax.sql.*;

import org.apache.catalina.loader.WebappClassLoader;
import org.apache.el.lang.ELArithmetic;
@WebServlet("/StartdateSearchServlet")
public class StartdateSearchServlet extends HttpServlet {

	private static final String CONTENT_TYPE = "text/html; charset=utf-8";

	DataSource ds = null;

	public void init() throws ServletException {
		try {
			InitialContext ctxt = new InitialContext();
			ds = (DataSource) ctxt.lookup("java:comp/env/jdbc/xe"); // for Oracle DB
		} catch (NamingException ne) {
			throw new ServletException(ne);
		}
	}

	public void doPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 開始日查詢

		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>開始日查詢</title></head>");
		out.println("<body>");

		out.println("<table border=1 width=60%>");
		out.println("<tr><th width=25%>UID</th>" + "<th width=50%>Title</th>" + "<th width=25%>Date</th><tr>");

		try {

			// 將request日期字串轉為date
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			String queryVal = request.getParameter("startdate");
			Date requestDate = sdf2.parse(queryVal);
			System.out.println(requestDate);
			// 帶入list內日期字串 轉為date格式

			SelectDAO selectDAO = new SelectDAO();
			List<ShowOj> showList = selectDAO.Showlist();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-EE");
			for (ShowOj showOj : showList) {
				String dateString = showOj.getACT_START_DATE();
				int NOInt = showOj.getACT_NO();
				String titleString = showOj.getACT_TITLE();
				Date date;
				date = sdf.parse(dateString);
				// System.out.println(date);
				if (date.after(requestDate)) {
					System.out.println(date + "在" + requestDate + "之後");
					// System.out.println(date.before(requestDate);
					out.println("<tr><td>" + NOInt + "</td><td>" + titleString + "</td><td>"
							+ dateFormat.format(date) + "</td></tr>");
				}
			}

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.println("</body></html>");
		out.close();

	}
}
