/*
 * JSP generated by Resin 2.1.9 (built Tue Apr 15 14:28:40 PDT 2003)
 */

import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class _chklogin__jsp extends com.caucho.jsp.JavaPage{
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.jsp.QPageContext pageContext = (com.caucho.jsp.QPageContext) com.caucho.jsp.QJspFactory.create().getPageContext(this, request, response, null, true, 8192, true);
    javax.servlet.jsp.JspWriter out = (javax.servlet.jsp.JspWriter) pageContext.getOut();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.http.HttpSession session = pageContext.getSession();
    javax.servlet.ServletContext application = pageContext.getServletContext();
    response.setContentType("text/html;charset=gb2312");
    request.setCharacterEncoding("GB2312");
    try {
      pageContext.write(_jsp_string0, 0, _jsp_string0.length);
      pageContext.write(_jsp_string0, 0, _jsp_string0.length);
      pageContext.write(_jsp_string1, 0, _jsp_string1.length);
      out.print((request.getParameter("UserName")));
      pageContext.write(_jsp_string2, 0, _jsp_string2.length);
      out.print((request.getParameter("IP")));
      pageContext.write(_jsp_string3, 0, _jsp_string3.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }
  }

  private com.caucho.java.LineMap _caucho_line_map;
  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.util.CauchoSystem.getVersionId() != 2057024151)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Depend depend;
      depend = (com.caucho.vfs.Depend) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public com.caucho.java.LineMap _caucho_getLineMap()
  {
    return _caucho_line_map;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.java.LineMap lineMap,
                   com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    mergePath.addClassPath(getClass().getClassLoader());
    _caucho_line_map = new com.caucho.java.LineMap("_chklogin__jsp.java", "/bin/chklogin.jsp");
    _caucho_line_map.add(3, 1);
    _caucho_line_map.add(1, 28);
    _caucho_line_map.add(8, 31);
    _caucho_line_map.add(8, 33);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("chklogin.jsp"), 1114521138000L, 806L);
    _caucho_depends.add(depend);
  }

  protected void _caucho_clearDepends()
  {
    _caucho_depends.clear();
  }

  private static byte []_jsp_string2;
  private static byte []_jsp_string1;
  private static byte []_jsp_string3;
  private static byte []_jsp_string0;
  static {
    try {
      _jsp_string2 = "&IP=".getBytes("GB2312");
      _jsp_string1 = "\r\n<script language=javascript>\r\n<!--\r\nfunction newWindow() \r\n{\r\nwindow.open('index.jsp?UserName=".getBytes("GB2312");
      _jsp_string3 = "', 'newwindow', 'height=760, width=1020, toolbar=no, menubar=no, title=no,scrollbars=auto, resizable=yes, location=no, status=no');\r\n}\r\n//-->\r\n</script>\r\n<html>\r\n<head>\r\n<title>\u7ba1\u7406\u5458\u767b\u5f55</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<link rel=\"stylesheet\" href=\"Style.css\">\r\n</head>\r\n<body bgcolor=\"#000000\"  leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n<script language=\"JavaScript\" type=\"text/JavaScript\">\r\nnewWindow();\r\nwindow.close();\r\n</script>\r\n</body>\r\n</html>\r\n".getBytes("GB2312");
      _jsp_string0 = "\r\n".getBytes("GB2312");
    } catch (java.io.UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }
}
