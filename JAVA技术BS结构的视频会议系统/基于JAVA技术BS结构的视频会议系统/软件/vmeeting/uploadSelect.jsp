<%@ page contentType="text/html;charset=gb2312"%>
<%@page import="java.io.*,java.util.*"%>
<html>
<head>
<title>VMeeting视频会议系统 V1.0</title>
<meta name="GENERATOR" content="Microsoft FrontPage 3.0">
<link rel="stylesheet" type="text/css" href="Style2.css">
<script language="JavaScript">
function OK(){
    window.close();
}
</script>
<style type="text/css">
<!--
.style1 {
	color: #FFFFFF;
	font-weight: bold;
}
Body
{
	FONT-FAMILY: "Verdana, Arial, 宋体";
	FONT-SIZE: 9pt;
	text-decoration: none;
	line-height: 150%;
	background-color: #E8EFF9;
	color: #FFFFFF;
	FONT-SIZE: 9pt;
   SCROLLBAR-FACE-COLOR: #E8EFF9;
	SCROLLBAR-HIGHLIGHT-COLOR: #E8EFF9;
	SCROLLBAR-SHADOW-COLOR: #E8EFF9;
	SCROLLBAR-3DLIGHT-COLOR: #E8EFF9;
	SCROLLBAR-ARROW-COLOR: #A5BFEC;
	SCROLLBAR-TRACK-COLOR: #A5BFEC;
	SCROLLBAR-DARKSHADOW-COLOR: #E8EFF9;
}
Td
{
	FONT-FAMILY: "Verdana, Arial, 宋体";
	FONT-SIZE: 9pt;
	color: #FFFFFF;
}
Input
{
	FONT-FAMILY: "Verdana, Arial, 宋体";
	FONT-SIZE: 9pt;
	color: #555555;
	background-color: #fefefe;
	border: 1px solid #555555;
}
-->
</style>
<body leftmargin="0" topmargin="0">
<table width="100%"  border="0" cellspacing="1" cellpadding="0" align="center" bgcolor="#6F89A5">
  <tr>
    <td height="25" background="images/bg_1.gif"><div align="center" class="style1">文件上传</div></td>
  </tr>
  <tr>
    <td width="31%" height="31" bgcolor="#E8EFF9"><iframe frameborder="0" name="select" src="upload_Add.jsp" width="320" height="30"></iframe></td>
  </tr>
 <tr>
    <td width="31%" height="26" bgcolor="#E8EFF9"><div align="center"><input name="ok" type="button" value="确定" onClick="javascript:window.opener.frames[0].location.reload();window.close();" style="width:60 "></div></td>
  </tr>
</table>
</body>
