package ja.ac.hal;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductRegist
 */
public class ProductRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductRegist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//転送用のオブジェクトを取得
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/confirm.jsp");
				
		//フォアード
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け対策
		//request.setCharacterEncoding("utf-8");
				
		//単一値（スカラー値）取得
		String id = request.getParameter("id");
				
		//複数値取得
		String[] cb = request.getParameterValues("cb");
				
		String err = "";
		//入力値チェック
		if(id == null || id.length() == 0) {
			err = "IDは必須入力です";
		}
		String cb_str = "";
		if(cb == null) {
			err += "Checkbox is required.";
		}else {
			for(String c : cb) {
				cb_str += c;
				}
			response.getWriter().append(id + cb_str);	
				}
		response.getWriter().append(id + cb_str + err);
	}

}
