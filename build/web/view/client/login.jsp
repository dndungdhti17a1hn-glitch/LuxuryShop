<%-- 
    Document   : login
    Created on : Apr 2, 2026, 4:38:30 PM
    Author     : ngocd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="form-box" id="loginBox">
<div class="close-arrow" onclick="closeLogin()">←</div>
<h2 id="formTitle">Đăng nhập</h2>
<form id="mainForm" action="Login" method="POST">
<p style="color: #ff4d4d; text-align: center; font-weight: bold;">${mess}</p>
<div id="loginFields">
<input name="userLogin" placeholder="Tên đăng nhập"required>
<input name="passLogin" type="password" placeholder="Mật khẩu"required>
</div>
<div id="registerFields" style="display:none">
<input name="fullname" type="text" placeholder="Họ tên"required>
<input name="email" type="email" placeholder="Email"required>
<input name="user"type="text" placeholder="Tên đăng nhập"required>
<input name="pass" type="password" placeholder="Mật khẩu"required>
<input name="repass"type="password" placeholder="Nhập lại mật khẩu"required>
</div>
