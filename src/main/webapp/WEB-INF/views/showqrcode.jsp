<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>QrCodeTest</title>
		<script src="${pageContext.request.contextPath}/static/js/qrcode.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bulma/bulma.css" />
		<script type="text/javascript">
			function qcrode(){
				new QRCode(document.getElementById('qrcode'),"www.baidu.com");
			}
		</script>
	</head>
	<body>
		<a class="button" onclick="qcrode();">Button</a>
		<div id="qrcode"></div>
	</body>
</html>