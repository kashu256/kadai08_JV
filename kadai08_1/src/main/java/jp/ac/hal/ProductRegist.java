package jp.ac.hal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductRegist
 */
@WebServlet("/ProductRegist")
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		//単一値（スカラー値）取得
		String id = request.getParameter("id");		
		String name = request.getParameter("name");
		String price  = request.getParameter("price");
		String[] cb_string = request.getParameterValues("cb");
	
		//複数値取得
		
		List<String> cb = new ArrayList<>(); 
		cb.add("");
		if (cb_string != null ) {
			for(String cbs : cb_string) {
				cb.add(cbs);
			}
			
		}
		
		List<String> err = new ArrayList<>();
		err.add("");
		
		if(id == null || id.length() == 0) {
			err.add("IDは必須入力です");
		}
		if(name == null || id.length() == 0) {
			err.add("Nameは必須入力です");
		}
		if(price == null || id.length() == 0) {
			err.add("Priceは必須入力です");
		}
		
		request.setAttribute("price", price);
		request.setAttribute("name", name);
		request.setAttribute("id", id);
		request.setAttribute("cb", cb);
		request.setAttribute("err", err);
		//転送用のオブジェクトを取得
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/confirm.jsp");
				
		//フォアード
		rd.forward(request, response);
	}

}