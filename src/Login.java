package service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;

public class Login implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Login");

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		String id = request.getParameter("id"); // name="id" name값을 가져온는거임.
		String passwd = request.getParameter("passwd");

		MemberDAO dao = MemberDAO.getInstance();
		int result = dao.memberAuth(id, passwd);

		if(result == 1 ) System.out.println("회원인증 성공");

		if(result == 1) { 		// 회원인증 성공 (로그인이 성공하면)
			session.setAttribute("id", id);  // "id" 라는 세션을 새로 만들고, id라는 값으로 설정함

		}else {					// 회원인증 실패
			out.println("<script>");
			out.println("alert('로그인실패');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();

			return null; 	// return null을 만나면 리턴값없이 메소드 탈출
		}


		ActionForward forward = new ActionForward();
		forward.setRedirect(false);  			// dispatcher 방식으로 포워딩하겠다.
		forward.setPath("./member/main.jsp");	// 포워딩할 파일명

		return forward;
	}

}
