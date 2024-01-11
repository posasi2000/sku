<%@ page language="java" contentType="text/html; charset=UTF-8"  %>
<%@ include file="./ssi.jsp" %>
<%@ include file="./top.jsp" %>

<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
 <title>input.jsp</title>

 <link rel="stylesheet" type="text/css" href="../css/InputCSS.css">
 <script src="../js/InputJS.js"></script>
 <script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
</head>

<body >
	<div class="all" align="center">
		<form name="iform" method="post" enctype="multipart/form-data" action="./bbsSave.jsp">
			<table class="table1">
				<tr>
					<th><font color=red>*</font> 사번</th>
					<td colspan= "2">
						<input type="text" size="10" name="sabun"  onkeyup="checklen(this,4)" placeholder="숫자4자리"> 
						<input type="button" onclick="checkSb()" value="중복확인">
					
					</td>
					<td rowspan="4">
						 <img src="../images/a1.png" width=200 height=250>
				    </td>
				</tr>
				<tr>
					<th><font color=red>*</font> 이름</th>
					<td colspan= "3"><input type="text" name="name"></td>
				</tr>
				<tr>
					<th><font color=red>*</font> 비밀번호</th>
					<td colspan= "3"><input type="text" name="pwd" value="1234"></td>
				</tr>
				<tr>
					<th><font color=red>*</font> 비밀번호 확인</th>
					<td colspan="3">
						<input type="text" name="pwd2"  value="1234"   placeholder="비밀번호입력">
						<input type="button" onclick="checkPwd();" value="비번확인">
						<label id="pwdlabel">&nbsp;</label>
					</td>
				</tr>
				
				<tr>
				 <th><font color=red>*</font> 파일선택</th>
				 <td colspan= "2"><input type="file" id="file" name="file" onchange="handleFileSelect()"></td>
				 <td rowspan="9">
					<div id="preview" ></div>
				 </td>
			    </tr>
				
				<tr>
					<th><font color=red>*</font> 주소</th>
					<td colspan= "3">
						<input type="text" size="10" id="code" name="code"> <input type="button" onclick="DaumPostcode()" value="우편번호"><p>
						<input type="text" size="40" id="juso1" name="juso1" value="서울 성북구  서동"><p>
						<input type="text" size="40" id="juso2" name="juso2"  value="강의장 303"><br>
					</td>
				</tr>
				<tr>
					<th><font color=red>*</font> 전화번호</th>
					<td colspan= "3">
						<input type="text" size="4" name="num1" value="010" maxlength="4">-
						<input type="text" size="4" name="num2" value="9900" maxlength="4">-
						<input type="text" size="4" name="num3" value="1234" maxlength="4">&nbsp;
						<label id="numlabel">&nbsp;&nbsp;숫자3~4자리 입력하세요</label>
					</td>
				</tr>
				<tr>
					<th><font color=red>*</font> email</th>
					<td colspan= "3">
						<input type="text" size="40" name="email"   value="bc@sku.com">
						<span id="email_ch"></span>
					</td>
				</tr>
				<tr>
					<th>URL</th>
					<td colspan= "3">
						<input type="text" size="40" name="url" value="https://www.daum.net">
					</td>
				</tr>
				<tr>
					<th><font color=red>*</font> 제목</th>
					<td colspan= "3" >
						<input type="text" size="40" name="title" value="snow"  maxlength="30" >
					</td>
				</tr>
				<tr>
					<th><font color=red>*</font> 내용</th>
					<td colspan= "3">
						<textarea name="content" id="content"  rows="5" cols="40" >bbs 게시판</textarea>
					</td>
				</tr>
			</table>
			<p>
			<input type="button" value="등록" onclick="check()">&nbsp;&nbsp;
			<input type="reset" value="초기화">&nbsp;&nbsp;
			<input type="button" value="목록" onclick="location.href='bbsList.jsp'">
		</form>
	</div>
</body>
</html>