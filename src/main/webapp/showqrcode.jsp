<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>QrCodeTest</title>
		<script src="js/qrcode.js"></script>
		<link rel="stylesheet" href="css/bulma/bulma.css" />
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