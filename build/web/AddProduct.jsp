<%-- 
    Document   : AddProduct
    Created on : Mar 25, 2013, 5:20:49 AM
    Author     : Analyze
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Product</title>
    </head>
    <body>
        

<style type="text/css" media="screen">
.pd_menu_01 {float:left; padding:0; margin:0;color: #FFFFFF;background: #D98D26;width:100%; border:solid 1px #004080;clear:both;} /*Color navigation bar normal mode*/
.pd_menu_01  a, .pd_menu_01 a:visited {
font-family:Arial, Helvetica, sans-serif;
font-style:normal;
font-weight:bold;
font-size:12px;
color: #FFFFFF;
background-color: #D98D26;
text-decoration: none;
}
.pd_menu_01 ul {list-style-type:none;padding:0; margin:0;}
.pd_menu_01 ul li {float:left; position:relative; z-index:auto !important /*Non-IE6*/; z-index:1000 /*IE6*/; border-right:solid 1px #004080; }
.pd_menu_01 ul li a {color: #FFFFFF;background: #D98D26;float:none !important /*Non-IE6*/; float:left /*IE-6*/; display:block; height:30px; line-height:30px; padding:0 10px 0 10px; text-decoration:none; }
.pd_menu_01 ul li ul {display:none; border:none;color: #FFFFFF;background: #D98D26;}
.pd_menu_01 ul li:hover a {background-color:#008000; text-decoration:none; color:#FFFF00;} /*Color main cells hovering mode*/
.pd_menu_01 ul li:hover ul {display:block;  position:absolute; z-index:999; top:29px; margin-top:1px; left:0;}
.pd_menu_01 ul li:hover ul li a {display:block; width:12em; height:auto; line-height:1.3em; margin-left:-1px; padding:5px 10px 5px 10px; border-left:solid 1px #004080; border-bottom: solid 1px #004080; background-color:#2B5E22;  color:#FFFFFF;} /*Color subcells normal mode*/
.pd_menu_01 ul li:hover ul li a:hover {background-color:#CA0000; text-decoration:none;color:#FFFF00;} /*Color subcells hovering mode*/
.pd_menu_01 table {position:absolute; top:0; left:0; border-collapse:collapse;color: #FFFFFF;background: #D98D26;}
.pd_menu_01 ul li a:hover {background-color:#008000; text-decoration:none;color:#FFFF00;} /*Color main cells hovering mode*/
.pd_menu_01 ul li a:hover ul {display:block; width:12em; position:absolute; z-index:999; top:29px; left:0; }
.pd_menu_01 ul li a:hover ul li a {display:block; width:12em; height:1px; line-height:1.3em; padding:4px 16px 4px 16px; border-left:solid 1px #004080; border-bottom: solid 1px #004080; background-color:#2B5E22;  color:#FFFFFF;} /*Color subcells normal mode*/
.pd_menu_01 ul li a:hover ul li a:hover {background-color:#CA0000; text-decoration:none;color:#FFFF00;} /*Color subcells hovering mode*/
</style>

</head>
<body style="background-color: beige">
<center>
<div style="width: 950px;">
<img src="images/123.jpg">
</div>

<div style="width: 950px;">
<div class="pd_menu_01 ">
<ul><li><a href="index.jsp">Home<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="AddProduct.jsp">Add Product<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="DeleteProduct.jsp">Delete Product<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="SalesAgent.jsp">Sales Agent<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="Retailer.jsp">Retailer<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="OrderDetail.jsp">Order Detail<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="OrderReport.jsp">Order Report<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="ViewFeedback.jsp">View Feedback<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="CompanyAccoun.jsp">Company Account<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
<ul><li><a href="index.jsp">Sign Out<!--[if IE 7]><!--></a><!--<![endif]--><!--[if IE]><table><tr><td><![endif]-->
<!--[if IE]></td></tr></table></a><![endif]--></li></ul>
</div>

</div>

<div style="width:950px;border-color:gray;border-style:solid;border-width:1px;">
    <form name="" action="AddProductConf.jsp">
<table width="950px">
<tr>
<td width="175px">&nbsp;</td>
<td width="600px">&nbsp;</td>
<td width="175px">&nbsp;</td>
</tr>
<tr>
<td width="175px">&nbsp;</td>
<td width="600px">
<fieldset>
<legend style="color:#E55D05;font-size:20pt;">Add Product</legend>
<table width="600px">

<tr>
<td width="200px" style="text-align:left;">&nbsp;Product Name</td>
<td width="100px" style="text-align:center;">&nbsp;:</td>
<td width="300px" style="text-align:left;">&nbsp;<input type="text" name="t1" ></td>
</tr>
<tr>
<td width="200px" style="text-align:left;">&nbsp;Product Category</td>
<td width="100px" style="text-align:center;">&nbsp;:</td>
<td width="300px" style="text-align:left;">&nbsp;<input type="text" name="t2" ></td>
</tr>
<tr>
<td width="200px" style="text-align:left;">&nbsp;Product Price</td>
<td width="100px" style="text-align:center;">&nbsp;:</td>
<td width="300px" style="text-align:left;">&nbsp;<input type="text" name="t3" ></td>
</tr>
<tr>
<td width="200px" style="text-align:left;">&nbsp;Product Color</td>
<td width="100px" style="text-align:center;">&nbsp;:</td>
<td width="300px" style="text-align:left;">&nbsp;<input type="text" name="t4" ></td>
</tr>
<tr>
<td width="200px" style="text-align:left;">&nbsp;</td>
<td width="100px" style="text-align:center;">&nbsp;</td>
<td width="300px" style="text-align:left;">&nbsp;
	<table width="300px">
	<tr>
	<td style="text-align:left;width:100;">&nbsp;<input type="Submit"  style="color:White;background-color:#E55D05;border-color:#E55D05;border-style:None;"  value="SUBMIT" ></td>
	<td style="text-align:left;width:10;">&nbsp;</td>
	<td style="text-align:left;width:190;">&nbsp;<input type="RESET" style="color:White;background-color:#E55D05;border-color:#E55D05;border-style:None;"  value="RESET" ></td>
	</tr>
	</table>
</td>
</tr>
</table>
</fieldset>
</td>
<td width="175px">&nbsp;</td>
</tr>
<tr>
<td width="175px">&nbsp;</td>
<td width="600px">&nbsp;</td>
<td width="175px">&nbsp;</td>
</tr>

<br>
<br>
<%
String ss=request.getParameter("msg");
if(ss!=null)
    {
    out.println(ss);

    }



%>
</table>

    </form>

<div style="width: 950px;">
                <table style="width: 950px;background-image: url('images/footer_bg.png'); background-repeat: repeat-x; background-attachment: scroll;" border="0" cellpadding="0" cellspacing="0">
                    <tr>
                        <td style="width: 225px;">
                            &nbsp;</td>
                        <td style="width: 500px; text-align:center;">
                            &nbsp;</td>

                        <td style="width: 225px;">
                            &nbsp;</td>
                    </tr>
                    <tr>
                        <td style="width: 225px;">
                            &nbsp;
                        </td>
                        <td style="width: 500px; text-align:center;">

                            &nbsp;

                            <span id="Label7" style="color:White;">Copyright &copy; Reserved to Distributed Logistic Network</span>
                        </td>
                        <td style="width: 225px;">
                            &nbsp;
                        </td>
                    </tr>

                    <tr>

                        <td style="width: 225px;">
                            &nbsp;</td>
                        <td style="width: 500px; text-align:center;">
                            <span id="Label8" style="color:White;">Developed By : Analyze Infotech</span>
                        </td>
                        <td style="width: 225px;">
                            &nbsp;</td>

                    </tr>

                    <tr>
                        <td style="width: 225px;">
                            &nbsp;</td>
                        <td style="width: 500px; text-align:center;">
                            &nbsp;</td>
                        <td style="width: 225px;">
                            &nbsp;</td>

                    </tr>
                </table>

            </div>
</center>
</body>
</html>