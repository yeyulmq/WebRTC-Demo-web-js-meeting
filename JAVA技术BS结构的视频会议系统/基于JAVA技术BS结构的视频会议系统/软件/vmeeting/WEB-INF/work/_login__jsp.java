/*
 * JSP generated by Resin 2.1.9 (built Tue Apr 15 14:28:40 PDT 2003)
 */

import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import chat.*;
import gdut.*;

public class _login__jsp extends com.caucho.jsp.JavaPage{
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
      pageContext.write(_jsp_string0, 0, _jsp_string0.length);
      pageContext.write(_jsp_string0, 0, _jsp_string0.length);
      pageContext.write(_jsp_string0, 0, _jsp_string0.length);
      //video_capture_local video = new video_capture_local();
      pageContext.write(_jsp_string1, 0, _jsp_string1.length);
      out.print((request.getRemoteAddr()));
      pageContext.write(_jsp_string2, 0, _jsp_string2.length);
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
    _caucho_line_map = new com.caucho.java.LineMap("_login__jsp.java", "/bin/login.jsp");
    _caucho_line_map.add(5, 1);
    _caucho_line_map.add(1, 30);
    _caucho_line_map.add(74, 37);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("login.jsp"), 1114511628000L, 4680L);
    _caucho_depends.add(depend);
  }

  protected void _caucho_clearDepends()
  {
    _caucho_depends.clear();
  }

  private static byte []_jsp_string1;
  private static byte []_jsp_string0;
  private static byte []_jsp_string2;
  static {
    try {
      _jsp_string1 = "\r\n\r\n<html>\r\n<head>\r\n<title>\u7ba1\u7406\u5458\u767b\u5f55</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n<link rel=\"stylesheet\" href=\"Style.css\">\r\n<script language=javascript>\r\n<!--\r\nfunction SetFocus()\r\n{\r\nif (document.Login.UserName.value==\"\")\r\n	document.Login.UserName.focus();\r\nelse\r\n	document.Login.UserName.select();\r\n}\r\nfunction CheckForm()\r\n{\r\n	if(document.Login.UserName.value==\"\")\r\n	{\r\n		alert(\"\u8bf7\u8f93\u5165\u7528\u6237\u540d\uff01\");\r\n		document.Login.UserName.focus();\r\n		return false;\r\n	}\r\n	if(document.Login.Password.value == \"\")\r\n	{\r\n		alert(\"\u8bf7\u8f93\u5165\u5bc6\u7801\uff01\");\r\n		document.Login.Password.focus();\r\n		return false;\r\n	}\r\n	if (document.Login.CheckCode.value==\"\"){\r\n       alert (\"\u8bf7\u8f93\u5165\u60a8\u7684\u9a8c\u8bc1\u7801\uff01\");\r\n       document.Login.CheckCode.focus();\r\n       return(false);\r\n    }\r\n}\r\n\r\nfunction CheckBrowser() \r\n{\r\n \r\n}\r\n//-->\r\n</script>\r\n</head>\r\n<body bgcolor=\"#000000\"  leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p><form name=\"Login\" action=\"chklogin.jsp\" method=\"post\" target=\"_parent\" onSubmit=\"return CheckForm();\">\r\n  <table width=\"100%\"  border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n      <td height=\"39\" colspan=\"3\" valign=\"bottom\" background=\"images/login_2.gif\"><img src=\"images/login_1.gif\" width=\"125\" height=\"41\"><img src=\"images/login_3.gif\" width=\"189\" height=\"41\"></td>\r\n    </tr>\r\n    <tr>\r\n      <td width=\"185\" height=\"166\" background=\"images/login_8.gif\">\r\n      </td>\r\n      <td width=\"608\" background=\"images/Login_Main.jpg\"><table width=\"300\" border=\"0\" cellspacing=\"8\" cellpadding=\"0\">\r\n        <tr>\r\n          <td align=\"right\"><span class=\"Glow\">\u7528\u6237\u540d\u79f0\uff1a</span></td>\r\n          <td colspan=\"2\"><input name=\"UserName\"  type=\"text\"  id=\"UserName4\" maxlength=\"20\" style=\"width:160px;border-style:solid;border-width:1;padding-left:4;padding-right:4;padding-top:1;padding-bottom:1\" onmouseover=\"this.style.background='#80CCF0';\" onmouseout=\"this.style.background='#FFFFFF'\" onFocus=\"this.select(); \"></td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\"><span class=\"Glow\">\u7528\u6237\u5bc6\u7801\uff1a</span></td>\r\n          <td colspan=\"2\"><input name=\"Password\"  type=\"password\" maxlength=\"20\" style=\"width:160px;border-style:solid;border-width:1;padding-left:4;padding-right:4;padding-top:1;padding-bottom:1\" onmouseover=\"this.style.background='#80CCF0';\" onmouseout=\"this.style.background='#FFFFFF'\" onFocus=\"this.select(); \"></td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"right\"><span class=\"Glow\">\u9a8c \u8bc1 \u7801\uff1a</span></td>\r\n          <td><input type=\"hidden\" name=\"IP\" value=\"".getBytes("GB2312");
      _jsp_string0 = "\r\n".getBytes("GB2312");
      _jsp_string2 = "\">\r\n 		  <input name=\"CheckCode\" size=\"6\" maxlength=\"4\" style=\"border-style:solid;border-width:1;padding-left:4;padding-right:4;padding-top:1;padding-bottom:1\" onmouseover=\"this.style.background='#80CCF0';\" onmouseout=\"this.style.background='#FFFFFF'\" onFocus=\"this.select(); \">\r\n              <font color=\"#FFFFFF\">\u8bf7\u5728\u5de6\u8fb9\u8f93\u5165</font> </td>\r\n          <td>&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n          <td colspan=\"3\">\r\n            <div align=\"center\">\r\n              <input   type=\"submit\" name=\"Submit\" value=\" \u786e&nbsp;\u8ba4 \" style=\"font-size: 9pt; height: 19; width: 60; color: #000000; background-color: #9DD6F1; border: 1 solid #2E92D4\" onMouseOver =\"this.style.backgroundColor='#ffffff'\" onMouseOut =\"this.style.backgroundColor='#9DD6F1'\">\r\n&nbsp;\r\n        <input name=\"reset\" type=\"reset\"  id=\"reset\" value=\" \u6e05&nbsp;\u9664 \" style=\"font-size: 9pt; height: 19; width: 60; color: #000000; background-color: #9DD6F1; border: 1 solid #2E92D4\" onMouseOver =\"this.style.backgroundColor='#ffffff'\" onMouseOut =\"this.style.backgroundColor='#9DD6F1'\">\r\n        <br>\r\n          </div></td>\r\n        </tr>\r\n      </table></td>\r\n      <td width=\"199\" background=\"images/login_7.gif\">&nbsp;</td>\r\n    </tr>\r\n    <tr>\r\n      <td height=\"41\" colspan=\"3\" align=\"right\" background=\"images/login_6.gif\"><table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"87%\"> \u3000\u3000\u3000\u3000\u3000Copyright&nbsp;&copy;&nbsp;\uff12\uff10\uff10\uff15&nbsp;<font color=\"#FF9900\">Summit,WJ28</font>&nbsp;.&nbsp;All&nbsp;Rights&nbsp;Reserved</td>\r\n          <td width=\"13%\"><img src=\"images/login_5.gif\" width=\"125\" height=\"41\"></td>\r\n        </tr>\r\n      </table>        </td>\r\n    </tr>\r\n  </table>\r\n</p>  \r\n</form>\r\n<script language=\"JavaScript\" type=\"text/JavaScript\">\r\nCheckBrowser();\r\nSetFocus(); \r\n</script>\r\n</body>\r\n</html>\r\n".getBytes("GB2312");
    } catch (java.io.UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }
}
