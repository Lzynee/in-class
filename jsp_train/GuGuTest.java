/**
 * 서블릿을 이용하여 웹에서 구구단 출력하기
 * 사용자에게 출력할 단 수를 입력 받는다.
 * 10행 2열의 테이블을 만들고
 * 1행을 제목 행, 2행 이하를 결과 출력 행으로 하여
 *             <1열>           |  <2열>
 * (입력 받은 단 수)*(1 ~ 9까지의 수) | (연산 결과)
 * 과 같은 형태로 출력한다.
 *  */


package com.mywork.webgugu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/guguTest")
public class GuGuTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 받아오기
		request.setCharacterEncoding("utf-8");  // 웹브라우저로 요청
		// 응답할 형식을 지정
		response.setContentType("text/html;charset=utf-8");  // 응답할 때의 형식 지정
		PrintWriter out = response.getWriter();  // 지정한 형식대로 응답을 출력
		
		
		// 구구단 출력 시작
		int dan = Integer.parseInt(request.getParameter("dan"));  // 받은 값을 정수값으로 파싱하여 받아 온다.
		
		// 테이블의 내부에 출력 - 1행 (제목)
		out.print("<table border=1 width=800 align=center>");
		out.print("<tr align=center bgcolor='ffff66'>");
		out.print("<td colspan=2>" + dan + " 단 출력 </td>");
		out.print("</tr>");
		
		// 두 번째 줄부터: 구구단 계산
		for(int i = 1; i < 10; i++) {
			out.print("<tr align=center>");
			out.print("<td width=400>");
			out.print(dan + "*" + i);  // 2행 이하 각 행의 1열: "dan * i" 출력
			out.print("</td>");
			out.print("<td width=400>");
			out.print(dan * i);  // 2행 이하 각 행의 2열: 곱셈 결과 출력
			out.print("</td>");			
		}
		
		out.print("</table>");
	}

}
