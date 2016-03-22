<%--
  Created by IntelliJ IDEA.
  User: marco
  Date: 2016-03-22
  Time: 오전 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="SHORTCUT ICON" href="/favicon.ico">
    <link rel="stylesheet" href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.6/css/bootstrap.min.css" href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" media="screen" />
    <link rel="stylesheet" href="/webjars/adminlte/2.3.2/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" href="/webjars/adminlte/2.3.2/dist/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css" href="/webjars/fontawesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" href="/webjars/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="stylesheet" href="/webjars/pace/1.0.2/themes/orange/pace-theme-barber-shop.css">
    <link rel="stylesheet" href="/webjars/datatables/1.10.11/media/css/dataTables.bootstrap.css">

    <script type="text/javascript" src="http://cdn.jsdelivr.net/webjars/jquery/2.2.1/jquery.min.js" src="/webjars/jquery/2.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/jquery.ui/1.11.4/jquery-ui.min.js" src="/webjars/jquery-ui/1.11.4/jquery-ui.min.js"></script>
    <script type="text/javascript" src="/webjars/adminlte/2.3.2/dist/js/app.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.10.11/js/jquery.dataTables.min.js" src="/webjars/datatables/1.10.11/media/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="https://cdn.datatables.net/1.10.11/js/dataTables.bootstrap.min.js" src="/webjars/datatables/1.10.11/media/js/dataTables.bootstrap.min.js"></script>
    <script type="text/javascript" src="/webjars/slimScroll/1.3.3/jquery.slimscroll.min.js"></script>
    <script type="text/javascript" src="/webjars/pace/1.0.2/pace.min.js"></script>
    <script type="text/javascript" src="/webjars/fastclick/1.0.6/lib/fastclick.js"></script>

</head>
<body class="skin-blue fixed" data-spy="scroll" data-target="#scrollspy">
<div class="wrapper">
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="left" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="footer" />
</div>
</body>
</html>
