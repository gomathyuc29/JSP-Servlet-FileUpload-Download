package com;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UploadedFilesServlet
 */
public class UploadedFilesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadedFilesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		handleRequest(request, response);
	}

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*write your code here*/
		//Code to fetch all files from the given location
		//put in a dto
		//take it to ALLfILES.JSP
		//String filepath=Paths.get(".").toAbsolutePath().normalize().toString();
		File[] files = new File( getServletContext().getRealPath("/")).listFiles();
		request.setAttribute("files", Arrays.asList(files));
		request.getRequestDispatcher("/allfiles.jsp").forward(request, response);
		
	}

}
